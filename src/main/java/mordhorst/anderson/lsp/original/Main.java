package mordhorst.anderson.lsp.original;

public class Main {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		r.setLargura(10f);
		r.setAltura(5f);
		System.out.println(r.getArea());
		
		Quadrado q = new Quadrado();
		q.setAltura(5f);
		System.out.println(q.getArea());	
		
		Retangulo rq = new Quadrado();		
		rq.setAltura(5f);
		rq.setLargura(10f);
		System.out.println(rq.getArea());		
	}

}
