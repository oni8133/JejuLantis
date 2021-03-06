package com.khd.jejulantis.client.member.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khd.jejulantis.model.Member;
@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession sql;
	private String ns = "query.member";
	
	@Override
	public boolean join(Member member) {

/*		for(int i = 1;i<70;i++) {
			String a = "xmember";
			member.setMember_id(a+i);*/
		int insert = sql.insert(ns+".memberjoin", member);
		int insert2 = sql.insert("query.detail.myDetail",member);
/*		}*/
		return false;
	}

	@Override
	public int check(String id) {
		
		int Select = sql.selectOne(ns+".idcheck", id);
		return Select;
	}

	@Override
	public Member mypage(String id) {
		Member select = sql.selectOne(ns+".idview", id);
		return select;
	}

	public Member modify(Member member) {
		//Member update = sql.selectOne(ns+".modify", member);
		int i = sql.update(ns+".modify", member);
		if(i>0) {
			Member update = sql.selectOne(ns+".idview", member);
			return update;
		}else {
			return null;
		}
	}

	@Override
	public int delete(String id) {
		int delete = sql.update(ns+".delete", id);
		System.out.println("id6:"+ id);
		return delete;
	}
	
	// ���̵� ã��
//	@Override
//	public String find_id(String email) {
//			int select = sql.selectOne(ns+".find_id",email);
//			return select;
//		}

	public String find_id(String email){
		String select = sql.selectOne(ns+".find_id",email);
		return select;
	}
	public String find_pwd(String id){
		String select = sql.selectOne(ns+".find_pwd",id);
		return select;
	}
//	@Override
//	public int deletemodify(String id) {
//		int i = sql.update(ns+".deletemodify", id);
//			return i;
//		}

	@Override
	public int echeck(String email) {
		int Select = sql.selectOne(ns+".emailcheck", email);
		return Select;
	}

	@Override
	public List<Member> memberList() {
		return sql.selectList(ns+".memberList");
	}

	public Member memgetUsersByID(String member_id) {
		Member select = sql.selectOne(ns+".memgetUsersByID",member_id);
		return select;	
		}

	public Member securityloginCheck(Member member) {
		Member select = sql.selectOne(ns+".securityloginCheck",member);
		return select;
	}

	public int change_pw(Member member) {
		int update = sql.update(ns+".change_pwd_update", member);
		return update;	
	}

	public int update_pw(Member member) {
		System.out.println("getMember_email:"+ member.getMember_email());
		int update = sql.update(ns+".find_pwd_update", member);
		return update;		
	}
	@Override
	public List<Member>newList(){
		return sql.selectList(ns+".myNewList");
	}
//	@Override
//	public Member delete(Member member) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public boolean modify(HashMap<String, String> hm) {
//		int count = sql.selectOne(ns+".modify", hm);
//		return count == 1 ? true : false; 
//	}

//	@Override
//	public int modify(Member member) {
//		int Update = sql.update(ns+".modify", member);
//		return Update;
//	}

	

//	@Override
//	public Member viewMember(String id) {
//		Member Select = sql.selectOne(ns+".viewMember", id);
//		return Select;
//	}

	
	

}
