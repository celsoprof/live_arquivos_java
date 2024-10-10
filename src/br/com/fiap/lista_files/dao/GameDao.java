package br.com.fiap.lista_files.dao;

import br.com.fiap.lista_files.model.Game;

import java.util.List;

public interface GameDao {

    public boolean gravar(Game g);

    public List<Game> listar();

    public Game buscarGamepeloId(int id);

}
