package byteman.examples.controller;


import java.util.Scanner;

import byteman.examples.model.Model;

public class ControllerImpl implements Controller {

	private Model model;
	
	public ControllerImpl(Model model) {
		this.model=model;
	}
	
	@Override
	public void start() {
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("Please put a list of comma seperated integers to be summed");
			String value = scan.nextLine();
			if(value.equalsIgnoreCase("quit")) break;
			String [] vals = value.replaceAll(" ", "").split(",");
			int [] data = new int[vals.length];
			for(int i=0;i<vals.length;i++) {
				data[i] = Integer.parseInt(vals[i]);
			}
			model.update(data);
		}
		scan.close();
		System.exit(0);
	}

}
