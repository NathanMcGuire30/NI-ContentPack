//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NoisyCricket
// Model Creator: 
// Created on: 27.09.2016 - 12:37:27
// Last changed on: 27.09.2016 - 12:37:27

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNoisyCricket extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNoisyCricket() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Shape 2
		gunModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Shape 3
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Shape 4
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Shape 5
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-3F, -29F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-3F, -28F, -1.5F);

		gunModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 11, 1, 1, 4, 11, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 2
		gunModel[2].setRotationPoint(-3F, -28F, 1.5F);
		gunModel[2].rotateAngleY = 1.57079633F;

		gunModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 11, 1, 1, 4, 11, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 3
		gunModel[3].setRotationPoint(8F, -28F, -1.5F);
		gunModel[3].rotateAngleY = -1.57079633F;

		gunModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 11, 1, 1, 4, 11, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 4
		gunModel[4].setRotationPoint(8F, -26F, -0.5F);
		gunModel[4].rotateAngleY = -1.57079633F;
		gunModel[4].rotateAngleZ = -1.57079633F;
		gunModel[5].setRotationPoint(8F, -27F, 1.5F);
		gunModel[5].rotateAngleY = -1.57079633F;
		gunModel[5].rotateAngleZ = -3.14159265F;

		gunModel[6].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 6
		gunModel[6].setRotationPoint(-4F, -28F, -0.5F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 7
		gunModel[7].setRotationPoint(5F, -27F, -0.5F);
		gunModel[7].rotateAngleZ = -0.15707963F;

		gunModel[8].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-3F, -28F, 0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(-3F, -27F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(8F, -29F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(8F, -26F, -0.5F);
		gunModel[11].rotateAngleX = 3.14159265F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(8F, -28F, -1.5F);
		gunModel[12].rotateAngleX = 1.57079633F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(8F, -27F, 1.5F);
		gunModel[13].rotateAngleX = 4.71238898F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(-3F, -26F, 0.5F);
		gunModel[14].rotateAngleX = 3.14159265F;
		gunModel[14].rotateAngleY = -3.14159265F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(-3F, -29F, -0.5F);
		gunModel[15].rotateAngleY = -3.14159265F;

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 17
		gunModel[16].setRotationPoint(-3F, -28F, 1.5F);
		gunModel[16].rotateAngleX = 1.57079633F;
		gunModel[16].rotateAngleY = -3.14159265F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 18
		gunModel[17].setRotationPoint(-3F, -27F, -1.5F);
		gunModel[17].rotateAngleX = 4.71238898F;
		gunModel[17].rotateAngleY = -3.14159265F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Ammo

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo
		ammoModel[0].setRotationPoint(-1.5F, -26.5F, -0.5F);



		thirdPersonOffset = new Vector3f(0 /16F, -3F /16F, 0F /16F);


		tiltGunTime = 0F;


		unloadClipTime = 0F;


		loadClipTime = 0F;


		untiltGunTime = 0F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}