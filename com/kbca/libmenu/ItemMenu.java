package com.kbca.libmenu;
import com.kbca.libmenu.interfaces.IAcaoMenu;
public class ItemMenu{
	private int id;
	private String descricao;
	private IAcaoMenu acao;

	public ItemMenu(int id, String descricao, IAcaoMenu acao){
		this.id = id;
		this.descricao = descricao;
		this.acao = acao;
	}

	public void executar(){
		acao.executar();
	}

	public String getDescricao(){
		return this.descricao;
	}

	public int getId(){
		return this.id;
	}

}
