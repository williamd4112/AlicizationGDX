package com.alicization.game;

import com.alicization.demo.DemoScene;
import com.alicization.demo.DemoUI;
import com.alicization.scene.GameScene;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {
	
	@Override
	public void create () {
		this.setScreen(new GameScene("demo"));
	}

	@Override
	public void render () {
		super.render();
	}
}
