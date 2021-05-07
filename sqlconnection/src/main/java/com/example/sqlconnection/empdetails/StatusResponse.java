package com.example.sqlconnection.empdetails;

public class StatusResponse {

	private String sucess="Updated Salary Succesfully";
	private String failed="No Employee Found";
	private String deleteSuccess="Deleted Successfully!";
	private String detailsFetched="All the details are fetched";
	
	public String getDeleteSuccess() {
		return deleteSuccess;
	}
	public String getDetailsFetched() {
		return detailsFetched;
	}
	public void setDetailsFetched(String detailsFetched) {
		this.detailsFetched = detailsFetched;
	}
	public void setDeleteSuccess(String deleteSuccess) {
		this.deleteSuccess = deleteSuccess;
	}
	public String getSucess() {
		return sucess;
	}
	public void setSucess(String sucess) {
		this.sucess = sucess;
	}
	public String getFailed() {
		return failed;
	}
	public void setFailed(String failed) {
		this.failed = failed;
	}
	
}
