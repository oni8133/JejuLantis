package com.khd.jejulantis.admin.review.DAO;

import java.util.List;

import com.khd.jejulantis.model.BranchName;
import com.khd.jejulantis.model.ReviewContent;
public interface ReviewDAO {
	
	List<ReviewContent> reviewContentAll(String manager_id);	
	void delete(String rent_review_no);
	List<ReviewContent> reviewContent();
	List<ReviewContent> reviewDetailContent(String rent_review_no);
	List<BranchName> branchNameContent(String branch_no);
	List<BranchName> listSelect();

}