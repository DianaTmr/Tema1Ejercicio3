import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("ej3.txt"));
		List<Ayuntamiento> lista = new ArrayList<Ayuntamiento>();
		
		while(sc.hasNextLine()){
			StringTokenizer st = new StringTokenizer(sc.nextLine(), ";.%");
			while(st.hasMoreTokens()){
				int n = Integer.parseInt(st.nextToken());
				String nombre = st.nextToken().replace("_", " ");
		
				Ayuntamiento a = new Ayuntamiento(n, nombre);
				lista.add(a);
			}
		}
		lista.sort((a2, a1) -> {
			if(a2.getNumHabitantes() - a1.getNumHabitantes() == 0){
				return a2.getNombre().compareTo(a1.getNombre());
			}
			return a2.getNumHabitantes() - a1.getNumHabitantes();
		});
		for(Ayuntamiento a : lista){
			System.out.println(a);
		}

		sc.close();
		sc.close();
		/*while(sc.hasNextLine()){
			StringTokenizer st = new StringTokenizer(sc.nextLine(), "%;_");
			while(st.hasMoreTokens()){
				int n = Integer.parseInt(st.nextToken());
				System.out.println(sc);
				String nombre = st.nextToken("_");
				System.out.println(sc);
				
				Ayuntamiento a = new Ayuntamiento(n, nombre);
				lista.add(a);
			}
		}
		lista.sort((a1, a2) -> {
			if(a2.getNumHabitantes() - a1.getNumHabitantes() == 0){
				return a2.getNombre().compareTo(a1.getNombre());
			}
			return a2.getNumHabitantes() - a1.getNumHabitantes();
		});
	
		for(Ayuntamiento a : lista){
			System.out.println(a);
		}

		sc.close();
		
		*/
	}

}
