package com.oppo.pojo.common;

public class PageEntity{
	
	static int DEFAULT_ROWS = 50;

	private int page = 1; // 当前第几页
    private int rows = DEFAULT_ROWS; // 每页显示多少条数据
    private int totalCount = 0; // 总条数
    private int totalPage = 0; // 总页数
    private String sortString;

    
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public String getSortString() {
		return sortString;
	}

	public void setSortString(String sortString) {
		this.sortString = sortString;
	}

}
