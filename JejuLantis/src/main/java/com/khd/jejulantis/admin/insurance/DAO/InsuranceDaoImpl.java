package com.khd.jejulantis.admin.insurance.DAO;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Insurance;
@Repository("InsuranceDao")
public class InsuranceDaoImpl implements InsuranceDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String ns_insurance = "insurance.Insurance";
	@Override
	public List<Insurance> insuranceList(String manager_id) {
		List<Insurance> insuranceList = sqlSession.selectList(ns_insurance+".insuranceList", manager_id);
		return insuranceList;
	}
	@Override
	public List<Insurance> insuranceAllList() {
		List<Insurance> insuranceAllList = sqlSession.selectList(ns_insurance+".insuranceAllList");
		return insuranceAllList;
	}
	@Override
	public List<Insurance> insuranceContent(int insurance_no) {
		List<Insurance> insuranceContent = sqlSession.selectList(ns_insurance+".insuranceContent", insurance_no);
		return insuranceContent;
	}
	@Override
	public void insuranceDUpdate(int insurance_no) {
		sqlSession.update(ns_insurance+".insuranceDUpdate", insurance_no);
	}
	@Override
	public void insuranceUpdate(Insurance insurance) {
		sqlSession.update(ns_insurance+".insuranceUpdate", insurance);
	}
	@Override
	public void insuranceInsert(Insurance insurance) {
		sqlSession.insert(ns_insurance+".insuranceInsert", insurance);
	}
	@Override
	public List<Insurance> carKindSelectBox(String manager_id) {
		List<Insurance> carKindSelectBox = sqlSession.selectList(ns_insurance+".carKindSelectBox", manager_id);
		return carKindSelectBox;
	}
	@Override
	public List<Insurance> branchNoSelect(String manager_id) {
		List<Insurance> branchNoSelect = sqlSession.selectList(ns_insurance+".branchNoSelect", manager_id);
		return branchNoSelect;
	}
	@Override
	public List<Insurance> insuranceCarNo(String manager_id, int car_kind_no) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("manager_id", manager_id);
		map.put("car_kind_no", car_kind_no);
		List<Insurance> insuranceCarNo = sqlSession.selectList(ns_insurance+".insuranceCarNo", map);
		return insuranceCarNo;
	}
	@Override
	public List<Insurance> insuranceUpdate(int insurance_no) {
		List<Insurance> insuranceUpdate = sqlSession.selectList(ns_insurance+".insuranceUpdate", insurance_no);
		return insuranceUpdate;
	}
	@Override
	public List<Insurance> carKindNotSelectBox(String manager_id, int insurance_no) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("manager_id", manager_id);
		map.put("insurance_no", insurance_no);
		List<Insurance> carKindNotSelectBox = sqlSession.selectList(ns_insurance+".carKindNotSelectBox", map);
		return carKindNotSelectBox;
	}
	@Override
	public void insuranceUpdateOk(Insurance insurance) {
		sqlSession.update(ns_insurance+".insuranceUpdateOk", insurance);
	}
	@Override
	public List<Insurance> kingBranchNotSelect(String manager_id) {
		List<Insurance> kingBranchNotSelect = sqlSession.selectList(ns_insurance+".kingBranchNotSelect", manager_id);
		return kingBranchNotSelect;
	}
	@Override
	public List<Insurance> kingBranchNotSelect(int branch_no) {
		List<Insurance> kingBranchNotSelect = sqlSession.selectList(ns_insurance+".kingBranchNot_Select", branch_no);
		return kingBranchNotSelect;
	}
	@Override
	public List<Insurance> kingBranchCarKindSelect(int branch_no) {
		List<Insurance> kingBranchCarKindSelect = sqlSession.selectList(ns_insurance+".kingBranchCarKindSelect", branch_no);
		return kingBranchCarKindSelect;
	}
	@Override
	public List<Insurance> identyBNo(String manager_id) {
		List<Insurance> identyBNo = sqlSession.selectList(ns_insurance+".identyBNo", manager_id);
		return identyBNo;
	}
	
}