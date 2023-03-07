package Controller;

public class Controller {

	public Controller() {
		super();
	}
public int numero (int a) {
	if (a == 1 || a == 2) {
		 // condição de para vai ser quando a for igual a 1 ou 2.
		return 1;
	}
	else {
		return numero (a - 1) + numero (a -2);
		
	}
}
}
