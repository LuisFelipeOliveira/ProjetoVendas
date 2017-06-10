import java.io.*;

public class ArqMan {

	public void salvar(Serializable serializable, String nome) throws FileNotFoundException {

		try {

			FileOutputStream fos = new FileOutputStream(nome);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(serializable);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado!");
		} catch (IOException e) {
			System.out.println("Erro!!");
		}
	}

	public Object lerObjeto(String i) {

		try {

			FileInputStream fis = new FileInputStream(i);
			ObjectInputStream oos = new ObjectInputStream(fis);
			Object objeto = oos.readObject();
			oos.close();
			fis.close();
			return objeto;

		} catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel encontrar o arquivo.");
			
		} catch (IOException e) {
			System.out.println("Erro!!");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro!!");
		}

		return null;
	}

}