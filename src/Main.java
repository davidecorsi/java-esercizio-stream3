import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Utilizzare gli stream per ordinare in base all'età la lista di impiegati.
 */
public class Main {
	public static void main(String[] args) {
		List<Impiegato> impiegatoList = new ArrayList<>(List.of(
				new Impiegato("Francesco", 170),
				new Impiegato("Daniele", 165),
				new Impiegato("Riccardo", 172),
				new Impiegato("Federico", 183),
				new Impiegato("Simone", 191),
				new Impiegato("Giovanni", 161),
				new Impiegato("Davide", 180),
				new Impiegato("Roberto", 195),
				new Impiegato("Antonio", 186),
				new Impiegato("Massimo", 178)));
		List<Impiegato> impiegatoSortList = impiegatoList.stream()
				.sorted((i1, i2) -> i1.getEta() - i2.getEta())
				.collect(Collectors.toList());
		impiegatoSortList.forEach(System.out::println);
 	}
}
