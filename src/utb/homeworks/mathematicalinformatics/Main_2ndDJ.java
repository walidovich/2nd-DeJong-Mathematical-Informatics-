package utb.homeworks.mathematicalinformatics;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main_2ndDJ {
	public static void main(String[] args) {

		new ExcelWriterRS();
		System.out.println("2nd DeJong Random Search is done.");
		new ExcelWriterSHC();
		System.out.println("2nd DeJong Stochastic Hill Climbing is done.");
		new ExcelWriterSA();
		System.out.println("2nd DeJong Simulated Annealing is done.");
		try {
			Thread.sleep(1000);
			Desktop.getDesktop().open(new File("2nd DeJong.xlsx"));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
