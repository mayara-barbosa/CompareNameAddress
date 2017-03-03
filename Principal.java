import java.net.InetAddress;
import java.net.UnknownHostException;

public class Principal {

	public static void main(String[] args) throws UnknownHostException {
		
		
		/*InetAddress ip = InetAddress.getByAddress(new byte[] {
		        (byte)172, (byte)217, (byte)29, (byte)131}
		);*/
		
		InetAddress nome =  InetAddress.getByName("google.com.br");
		
		if(nome.getHostAddress().equals("172.217.29.195")){
			System.out.println("Iguais");
		}
		
		System.out.println(nome);
		//System.out.println(ip);
		
		
		
		/*
		if(ip.equals(nome)){
			System.out.println("Iguais");
		}else{
			System.out.println("diferentes");
		}*/
		
		
	}

}
