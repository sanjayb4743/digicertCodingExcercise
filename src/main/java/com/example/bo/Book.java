/**
 * 
 */
package com.example.bo;

/**
 * @author sanjay
 *
 */
public class Book {

	
	private Long serialNumber;
	private String title;
	private String author;
	/**
	 * @return the serialNumber
	 */
	public Long getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
}
