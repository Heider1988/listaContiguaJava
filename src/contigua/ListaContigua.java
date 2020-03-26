package contigua;

import dados.Item;

public class ListaContigua {

	private Item[] info;
	private int fim;

	public ListaContigua(int tamanho) {
		this.info = new Item[tamanho];
		this.fim = 0;
	}

	public Item getInfo(int i) {
		return info[i];
	}

	public void setInfo(Item elem, int i) {
		this.info[i] = elem;
	}

	public int getFim() {
		return fim;
	}

	// eVazia
	public boolean eVazia() {
		return (this.fim == 0);
	}

	// eCheia
	public boolean eCheia() {
		return (this.fim == this.info.length);
	}

}
