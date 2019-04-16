package com.bwei.demo.uitl;

public class PageUtils {

	//��ǰҳ
	private int currentPage;
	//��һҳ
	private int prevPage;
	//��һҳ
	private int nextPage;
	//βҳ
	private int lastPage;
	//����������
	private int count;
	//ÿҳ����
	private int  pageSize;
	//��ҳ������
	private int pageRecord;
	//��ҳ
	private String page;
	
	
	public PageUtils(String currentPage,int count,int pageSize) {
		init(currentPage, count, pageSize);
		initPrevPage();
		initLastPage();
		initNextPage();
		initPageRecord();
		initPage();
	}
	//��ʼ��������ֵ
	private void init(String currentPage,int count,int pageSize) {
		if(currentPage==null||currentPage.equals("")) {
			currentPage="1";
		}
		this.currentPage = Integer.parseInt(currentPage);
		this.count = count;
		this.pageSize = pageSize;
	}
	//������һҳ
	private void initPrevPage() {
		if(currentPage==1) {
			prevPage = 1;
		}else {
			prevPage = currentPage-1;
		}
	}
	//�������һҳ
	private void initLastPage() {
		if(count%pageSize==0) {
			lastPage=count/pageSize;
		}else {
			lastPage=count/pageSize+1;
		}
	}
	//������һҳ
	private void initNextPage() {
		if(currentPage==lastPage) {
			nextPage=lastPage;
		}else {
			nextPage=currentPage+1;
		}
	}
	//���������
	private void initPageRecord() {
		pageRecord = (currentPage-1)*pageSize;
	}


	private void initPage() {
		page = "第"+currentPage+"/"+lastPage+"页，共"+count+"条数据。";
		page +="<input type='button' value='首页' onclick='page(1)' >";
		page +="<input type='button' value='上一页' onclick='page("+prevPage+")' >";
		page +="<input type='button' value='下一页' onclick='page("+nextPage+")' >";
		page +="<input type='button' value='尾页' onclick='page("+lastPage+")' >";
	}

	public int getCurrentPage() {
		return currentPage;
	}


	public int getPrevPage() {
		return prevPage;
	}


	public int getNextPage() {
		return nextPage;
	}


	public int getLastPage() {
		return lastPage;
	}


	public int getCount() {
		return count;
	}


	public int getPageSize() {
		return pageSize;
	}


	public int getPageRecord() {
		return pageRecord;
	}


	public String getPage() {
		return page;
	}
	
	
}
