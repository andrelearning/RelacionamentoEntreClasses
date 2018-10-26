
public class testaLuta {
	public static void main(String[] args) {
      Lutador lut[] = new Lutador [5];
      
      //Criando lutadores
      lut[1] = new Lutador("ded", "França", 20, 1.83, 90, 14, 2, 3);
      lut[2] = new Lutador("Ped", "Brasil", 22, 1.78, 60, 8, 5, 2);
      
      
      
      
      //Lutas
      
      Luta pq1 = new Luta();
      
      pq1.marcarLuta(lut[1], lut[1]);
      pq1.lutar();
      
      lut[1].apresentar();
      lut[2].apresentar();
	}
}
