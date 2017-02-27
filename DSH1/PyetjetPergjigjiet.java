import javax.swing.JRadioButton;

public class PyetjetPergjigjiet {

	public String pyetja;
	public String pergjigjia1;
	public String pergjigjia2;
	public String pergjigjia3;
	public String pergjigjia4;
	public String pergjigjiaSakte;

	public PyetjetPergjigjiet(String p, String pergj1, String pergj2, String pergj3, String pergj4, String pergjSakte) 
	{
		pyetja = p;
		pergjigjia1=pergj1;
		pergjigjia2= pergj2;
		pergjigjia3= pergj3;
		pergjigjia4 = pergj4;
		pergjigjiaSakte = pergjSakte;

	}

	String getPyetja() {
		return pyetja;
	}

	String getPergj1() {
		return pergjigjia1;
	}

	String getPergj2() {
		return pergjigjia2;
	}

	String getPergj3() {
		return pergjigjia3;
	}

	String getPergji4() {
		return pergjigjia4;
	}

	String getPergjigjiaSakte() {
		return pergjigjiaSakte;
	}

	

	}
