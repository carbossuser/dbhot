/*
�̳е����ã�������Լ̳и��ࡣ������Եõ����á�
���ⲻ����Ҫ�����ã�����һ���������ã�
*/
//�������µĴ��룬��һ�´���ʲô����
//����ӷ�ף�����û�еõ�����
public class ExtendsTest01{
	public static void main(String[]args){
		//����һ����ͨ���˻�
		Account act = new Account();
		act.setActno("111111");
		act.setBalance(10000);
		System.out.println(act.getActno() + ",���" + act.getBalance());

		//���������˻�
		CreditAccount ca = new CreditAccount();
		ca.setActno("222222");
		ca.setBalance(-10000);
		ca.setCredit(0.99);
		System.out.println(ca.getActno() + ",���" + act.getBalance() + ",������" + ca.getCredit());


	}

}
//�����˻���
//�˻������ԣ��˺š����
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

//�������͵��˻������ÿ���
//�˻������ԣ��˺š���������
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

	//�������еķ���
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}

}