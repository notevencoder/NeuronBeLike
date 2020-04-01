package com.mygdx.game;

import NeuronNetWorksStuff.NeuronNet;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends Game {

	private NeuronNet net;
	
	@Override
	public void create () {
		net = new NeuronNet(2,1,2, new int[] {3, 2});

	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {

	}
}
