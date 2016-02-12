package GridworldPack;

import java.awt.Color;
import java.util.Random;

import javax.swing.colorchooser.ColorSelectionModel;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {

		World<Object> world1 = new World<Object>();
		int randomInt = new Random().nextInt(9);
		int randomInt2 = new Random().nextInt(9);
		/////////////////////////////////////////////////////////////
		int y1 = randomInt + 1;
		int x1 = randomInt2;
		int y2 = randomInt - 1;
		int x2 = randomInt2;
		int y3 = 2;
		int x3 = 1;
		int y4 = 0;
		int x4 = 1;
		/////////////////////////////////////////////////////////////
		Location flowerLocation1 = new Location(x1, y1);
		Location flowerLocation2 = new Location(x2, y2);
		Location flowerLocation3 = new Location(x3, y3);
		Location flowerLocation4 = new Location(x4, y4);
		Location Spawn1 = new Location(1, 1);
		Location RandomSpawn = new Location(randomInt, randomInt2);
		/////////////////////////////////////////////////////////////
		Bug bug1 = new Bug();
		Bug bug2 = new Bug();
		/////////////////////////////////////////////////////////////
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		Flower flower3 = new Flower();
		Flower flower4 = new Flower();
		/////////////////////////////////////////////////////////////
		world1.show();
		bug1.setColor(Color.ORANGE);
		bug2.setColor(Color.BLUE);
		/////////////////////////////////////////////////////////////
		world1.add(Spawn1, bug1);
		world1.add(RandomSpawn, bug2);
		world1.add(flowerLocation1, flower1);
		world1.add(flowerLocation2, flower2);
		world1.add(flowerLocation3, flower3);
		world1.add(flowerLocation4, flower4);
		/////////////////////////////////////////////////////////////
		/*bug1.setColor(Color.ORANGE);
		bug1.putSelfInGrid((Grid<Actor>) world1, Spawn1);
		bug2.setColor(Color.BLUE);
		bug2.putSelfInGrid((Grid<Actor>) world1, RandomSpawn);*/
		/////////////////////////////////////////////////////////////
		for (int i = 0; i < 10; i++) {
			int x = 0;
			int y = 0;
			for (int t = 0; t < 10; t++) {
				Flower flowerSpawn = new Flower();
				Location flowerSpawner = new Location(x, y);
				world1.add(flowerSpawner, flowerSpawn);
				y += 1;
			}
			x += 1;
		}
	}

}
