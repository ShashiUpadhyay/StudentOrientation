package studentOrientation.validation;

public enum ErrorEnum {
	INVALID_ENTRY(0, "Kindly enter corrrent value");

	/*
	 * @param errorInfo_In error description
	 * @paramerrorId_In error ID
	 * 
	 */
	ErrorEnum(int errorId_In, String errorInfo_In) {
		errorId = errorId_In;
		errorInfo = errorInfo_In;
	}

	private int errorId;
	private String errorInfo;

	/**
	 * @return the errorId value
	 */
	public int getErrorId() {
		return errorId;
	}

	/**
	 * @param errorId
	 *            the errorId to set
	 */
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}

	/**
	 * @return the errorInfo
	 */
	public String getErrorInfo() {
		return errorInfo;
	}

	/**
	 * @param errorInfo
	 *            the errorInfo to set
	 */
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

}
