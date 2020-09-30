package com.mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

public class Main extends SimpleApplication {

    public static void main(String... args) {

        Main main = new Main();

        AppSettings appSettings = new AppSettings(true);
        appSettings.setResolution(800, 600);

        main.setSettings(appSettings);
        main.setShowSettings(true);
        main.start();
    }

    private Geometry cube;

    @Override
    public void simpleInitApp() {

        Mesh mesh = new Box(1,1,1);
        cube = new Geometry("Cube", mesh);

        Material unshaded = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        cube.setMaterial(unshaded);

        rootNode.attachChild(cube);
    }

    @Override
    public void simpleUpdate(float tpf) {
        cube.rotate(0, tpf * 0.5f, 0);
    }
}
