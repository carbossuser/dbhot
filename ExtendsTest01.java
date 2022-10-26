/*
继承的作用：子类可以继承父类。代码可以得到复用。
（这不是重要的作用，而是一个基本作用）
*/
//分析以下的代码，看一下存在什么问题
//代码臃肿，代码没有得到复用
public class ExtendsTest01{
	public static void main(String[]args){
		//创建一个普通的账户
		Account act = new Account();
		act.setActno("111111");
		act.setBalance(10000);
		System.out.println(act.getActno() + ",余额" + act.getBalance());

		//创建信用账户
		CreditAccount ca = new CreditAccount();
		ca.setActno("222222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);
		System.out.println(ca.getActno() + ",余额" + act.getBalance() + ",信誉度" + ca.getCredit());


	}

}
//银行账户类
//账户的属性：账号、余额
//
class Account{
	private String actno;
	private double balance;

	public Account(){
	}

	public Account(String actno, double balance){
	this.actno = actno;
	this.balance = balance;
	}

	//setter and getter
	public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}

}

//其他类型的账户：信用卡类
//账户的属性：账号、余额、信誉度
class CreditAccount{
	private String actno;
	private double balance;
	private double credit;

	public CreditAccount(){
	}

	//setter and getter
	public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}

	//子类特有的方法
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}

}