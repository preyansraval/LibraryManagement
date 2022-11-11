package com.library.management.model;

import java.sql.Timestamp;

public class Books {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategory;
	private int bookCount;
	private short activeFlag;
	private Timestamp crtDt;
	private Long crtUsr;
	private Timestamp lstUpdtDt;
	private Long lstUpdtUsr;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public short getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(short activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Timestamp getCrtDt() {
		return crtDt;
	}
	public void setCrtDt(Timestamp crtDt) {
		this.crtDt = crtDt;
	}
	public Long getCrtUsr() {
		return crtUsr;
	}
	public void setCrtUsr(Long crtUsr) {
		this.crtUsr = crtUsr;
	}
	public Timestamp getLstUpdtDt() {
		return lstUpdtDt;
	}
	public void setLstUpdtDt(Timestamp lstUpdtDt) {
		this.lstUpdtDt = lstUpdtDt;
	}
	public Long getLstUpdtUsr() {
		return lstUpdtUsr;
	}
	public void setLstUpdtUsr(Long lstUpdtUsr) {
		this.lstUpdtUsr = lstUpdtUsr;
	}
}
