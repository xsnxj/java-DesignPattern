package 工厂模式_静态工厂方法模式;

public class SendFactory {
	public static Sender produceMail(){  
		return new MailSender();  
	}  

	public static Sender produceSms(){  
		return new SmsSender();  
	}  
}
