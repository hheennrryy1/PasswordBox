package com.henry.entity;

import java.util.List;

public class Page<T> {
	// 1.每页显示数量(everyPage)
	private int everyPage;
	// 2.总记录数(totalCount)
	private Long totalCount;
	// 3.总页数(totalPage)
	private int totalPage;
	// 4.当前页(currentPage)
	private int currentPage;
	// 5.起始点(beginIndex)
	private int beginIndex;
	//6.是否有上一页(hasPrePage)
	private boolean hasPrePage;
	//7.是否有下一页(hasNextPage)
	private boolean hasNextPage;
	//8.具体数据
	private List<T> items;
	
	public Page(int everyPage, Long totalCount, int totalPage, int currentPage, int beginIndex, boolean hasPrePage, boolean hasNextPage) {
		super();
		this.everyPage = everyPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}

	public int getEveryPage() {
		return everyPage;
	}
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public boolean isHasPrePage() {
		return hasPrePage;
	}
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
}
