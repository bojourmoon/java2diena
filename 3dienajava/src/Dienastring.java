
public class Dienastring {
	public static void main(String[] args) {
		String str = "java bla bla   ";
		System.out.println("str:" + str);
		
		String str2;
		
	if (str.length() > 10) {
	str =str + "is hard";	//ja string bus lielaks par 10 tad dodas ieksa cikla.
		}
	
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	
	System.out.println(str.substring(5)); //nogriez tik talu cik noradita cipars 
	
	 int endStringIndex = str.length() -5; //uztaisu jaunu kurs jau no pamatvertibas beigam nogrieþ 5
	System.out.println(str.substring(5, endStringIndex));
	
	
	
	
	System.out.println(str.substring(5, 10));//izgriez to ciparu diapazonu kurs 
	//noradits un atspogulo tikai tos.skaita lidz 9 saja gadijuma
	
	System.out.println(str);
	
	String check = "bla bla"; //parbaudu  vai taja ietilpst bla bla, var gan ar 
	//stringu jaunu gan vienkarsi noradit ko tiesi gribu parbaudit
	System.out.println(str.contains("bla bla "));
	System.out.println(str.contains(check));
	
	
	
	
	
	//coding bat...var pameginat uzdevumus bez sava datora un programmam online
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}


