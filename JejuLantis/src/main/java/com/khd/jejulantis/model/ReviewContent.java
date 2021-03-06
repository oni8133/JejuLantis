package com.khd.jejulantis.model;

import java.sql.Date;

public class ReviewContent {

	private String member_name;
	private String branch_name;
	private String name;
	private String car_name;
	private String car_fuel;
	private String car_type;
	private String insurance_name;
	private Date rent_reserv_start;
	private Date rent_reserv_end;
	private String car_image;
	//관리자페이지 이용후기 상세보기 
	private long rent_review_no;
	private long rent_reserv_no;
	private long driver_line_no;
	private long rent_payment_no;
	private long member_no;
	private long car_no;
	private long car_info_no;
	private long car_kind_no;
	private long branch_no;
	private long insurance_no;
	private String rent_review_title;
	private String rent_review_content;
	private double rent_review_rating_car;
	private Date rent_review_date;
	
	public ReviewContent() {}
	//관리자페이지 이용후기 상세보기 
	public ReviewContent(String member_name, long rent_review_no, Date rent_review_date, String branch_name,
			String name, Double rent_review_rating_car, String rent_review_content, String car_name,
			String car_fuel, String car_type, Date rent_reserv_start, Date rent_reserv_end,
			String car_image) {
		super();
		this.member_name = member_name;

		this.rent_review_no = rent_review_no;
		this.rent_review_date = rent_review_date;
		this.branch_name = branch_name;
		this.name = name;
		this.rent_review_rating_car = rent_review_rating_car;
		this.rent_review_content = rent_review_content;

		this.car_name = car_name;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.rent_reserv_start = rent_reserv_start;
		this.rent_reserv_end = rent_reserv_end;
		this.car_image = car_image;
	}
	public ReviewContent(long rent_review_no, long rent_reserv_no, long driver_line_no, long rent_payment_no,
			long member_no, long car_info_no, long car_kind_no, long branch_no, long insurance_no,
			String rent_review_title, String rent_review_content, Double rent_review_rating_car,
			Date rent_review_date) {
		super();
		this.rent_review_no = rent_review_no;
		this.rent_reserv_no = rent_reserv_no;
		this.driver_line_no = driver_line_no;
		this.rent_payment_no = rent_payment_no;
		this.member_no = member_no;
		this.car_info_no = car_info_no;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.rent_review_title = rent_review_title;
		this.rent_review_content = rent_review_content;
		this.rent_review_rating_car = rent_review_rating_car;
		this.rent_review_date = rent_review_date;
	}
	
	public ReviewContent(String member_name, String branch_name, String name, String car_name, String car_fuel,
			String car_type, String insurance_name, Date rent_reserv_start, Date rent_reserv_end, String car_image,
			long rent_review_no, long rent_reserv_no, long driver_line_no, long rent_payment_no, long member_no, long car_no,
			long car_info_no, long car_kind_no, long branch_no, long insurance_no, String rent_review_title,
			String rent_review_content, Double rent_review_rating_car, Date rent_review_date) {
		super();
		this.member_name = member_name;
		this.branch_name = branch_name;
		this.name = name;
		this.car_name = car_name;
		this.car_fuel = car_fuel;
		this.car_type = car_type;
		this.insurance_name = insurance_name;
		this.rent_reserv_start = rent_reserv_start;
		this.rent_reserv_end = rent_reserv_end;
		this.car_image = car_image;
		this.rent_review_no = rent_review_no;
		this.rent_reserv_no = rent_reserv_no;
		this.driver_line_no = driver_line_no;
		this.rent_payment_no = rent_payment_no;
		this.member_no = member_no;
		this.car_no = car_no;
		this.car_info_no = car_info_no;
		this.car_kind_no = car_kind_no;
		this.branch_no = branch_no;
		this.insurance_no = insurance_no;
		this.rent_review_title = rent_review_title;
		this.rent_review_content = rent_review_content;
		this.rent_review_rating_car = rent_review_rating_car;
		this.rent_review_date = rent_review_date;
	}
	public long getDriver_line_no() {
		return driver_line_no;
	}
	public void setDriver_line_no(long driver_line_no) {
		this.driver_line_no = driver_line_no;
	}
	public long getCar_no() {
		return car_no;
	}
	public void setCar_no(long car_no) {
		this.car_no = car_no;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_fuel() {
		return car_fuel;
	}
	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getInsurance_name() {
		return insurance_name;
	}
	public void setInsurance_name(String insurance_name) {
		this.insurance_name = insurance_name;
	}
	public Date getRent_reserv_start() {
		return rent_reserv_start;
	}
	public void setRent_reserv_start(Date rent_reserv_start) {
		this.rent_reserv_start = rent_reserv_start;
	}
	public Date getRent_reserv_end() {
		return rent_reserv_end;
	}
	public void setRent_reserv_end(Date rent_reserv_end) {
		this.rent_reserv_end = rent_reserv_end;
	}
	public String getCar_image() {
		return car_image;
	}
	public void setCar_image(String car_image) {
		this.car_image = car_image;
	}
	public long getRent_review_no() {
		return rent_review_no;
	}
	public void setRent_review_no(long rent_review_no) {
		this.rent_review_no = rent_review_no;
	}
	public long getRent_reserv_no() {
		return rent_reserv_no;
	}
	public void setRent_reserv_no(long rent_reserv_no) {
		this.rent_reserv_no = rent_reserv_no;
	}
	public long getdriver_line_no() {
		return driver_line_no;
	}
	public void setdriver_line_no(long driver_line_no) {
		this.driver_line_no = driver_line_no;
	}
	public long getRent_payment_no() {
		return rent_payment_no;
	}
	public void setRent_payment_no(long rent_payment_no) {
		this.rent_payment_no = rent_payment_no;
	}
	public long getMember_no() {
		return member_no;
	}
	public void setMember_no(long member_no) {
		this.member_no = member_no;
	}
	public long getCar_info_no() {
		return car_info_no;
	}
	public void setCar_info_no(long car_info_no) {
		this.car_info_no = car_info_no;
	}
	public long getCar_kind_no() {
		return car_kind_no;
	}
	public void setCar_kind_no(long car_kind_no) {
		this.car_kind_no = car_kind_no;
	}
	public long getBranch_no() {
		return branch_no;
	}
	public void setBranch_no(long branch_no) {
		this.branch_no = branch_no;
	}
	public long getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(long insurance_no) {
		this.insurance_no = insurance_no;
	}
	public String getRent_review_title() {
		return rent_review_title;
	}
	public void setRent_review_title(String rent_review_title) {
		this.rent_review_title = rent_review_title;
	}
	public String getRent_review_content() {
		return rent_review_content;
	}
	public void setRent_review_content(String rent_review_content) {
		this.rent_review_content = rent_review_content;
	}
	public double getRent_review_rating_car() {
		return rent_review_rating_car;
	}
	public void setRent_review_rating_car(Double rent_review_rating_car) {
		this.rent_review_rating_car = rent_review_rating_car;
	}
	public Date getRent_review_date() {
		return rent_review_date;
	}
	public void setRent_review_date(Date rent_review_date) {
		this.rent_review_date = rent_review_date;
	}

	
}
