package parser;

public class QTInfo {

	private int innerId; // 行号
	private String operator; //运算符
	private String arg1;//主对象
	private String arg2;//副对象
	private String result;//结果

	public QTInfo(int innerId ,String operator, String arg1, String arg2, String result) {
		super();
		this.innerId = innerId;
		this.operator = operator;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = result;
	}

	public QTInfo(int innerId,String operator, String arg1, String arg2, int result) {
		this(innerId,operator, arg1, arg2, result + "");
	}

	public String getOperator() {
		return this.operator;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setResult(int result) {
		this.result = "" + result;
	}

	public String getResult() {
		return this.result;
	}

	public void setInnerId(int innerID) {
		this.innerId = innerID;
	}
	public String toString() {
		return String.valueOf(innerId)+": "+"(  "+operator+"  "+arg1+"  "+arg2+"  "+result+"  )\n";
	}


	


}
