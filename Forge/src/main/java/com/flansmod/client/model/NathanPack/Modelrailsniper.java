//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI Rail Sniper Rifle
// Model Creator: 
// Created on: 11.11.2017 - 12:17:53
// Last changed on: 11.11.2017 - 12:17:53

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelrailsniper extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelrailsniper() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[23];
		gunModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 14
		gunModel[7] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 18
		gunModel[10] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 20
		gunModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
		gunModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 22
		gunModel[13] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 23
		gunModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gunModel[15] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 27
		gunModel[16] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 28
		gunModel[17] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 30
		gunModel[18] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 31
		gunModel[19] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 32
		gunModel[20] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 33
		gunModel[21] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 34
		gunModel[22] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 35

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 2
		gunModel[0].setRotationPoint(-9F, -21F, -3F);

		gunModel[1].addBox(0F, 0F, 0F, 22, 8, 6, 0F); // Box 3
		gunModel[1].setRotationPoint(-5F, -21F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(-8F, -14F, -2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 8
		gunModel[3].setRotationPoint(1F, -13F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 8, 9, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[4].setRotationPoint(5F, -13F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[5].setRotationPoint(29F, -20F, -2F);

		gunModel[6].addBox(0F, 0F, 0F, 44, 2, 2, 0F); // Box 14
		gunModel[6].setRotationPoint(29F, -19F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		gunModel[7].setRotationPoint(29F, -19F, -2F);

		gunModel[8].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 17
		gunModel[8].setRotationPoint(-5F, -5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 18
		gunModel[9].setRotationPoint(-8F, -5F, -1.5F);

		gunModel[10].addBox(0F, 0F, 0F, 16, 4, 4, 0F); // Box 20
		gunModel[10].setRotationPoint(9F, -13F, -2F);

		gunModel[11].addBox(0F, 0F, 0F, 12, 5, 5, 0F); // Box 21
		gunModel[11].setRotationPoint(17F, -21F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[12].setRotationPoint(29F, -18F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 27, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		gunModel[13].setRotationPoint(46F, -17F, -2F);

		gunModel[14].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 25
		gunModel[14].setRotationPoint(65F, -20.5F, -0.5F);

		gunModel[15].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 27
		gunModel[15].setRotationPoint(-5F, -22F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[16].setRotationPoint(26F, -22F, -2F);

		gunModel[17].addBox(0F, 0F, 0F, 22, 5, 9, 0F); // Box 30
		gunModel[17].setRotationPoint(-3F, -20F, -4F);

		gunModel[18].addBox(0F, 0F, 0F, 29, 3, 4, 0F); // Box 31
		gunModel[18].setRotationPoint(17F, -17F, -2F);

		gunModel[19].addBox(0F, 0F, 0F, 26, 1, 4, 0F); // Box 32
		gunModel[19].setRotationPoint(17F, -14F, -2F);

		gunModel[20].addBox(0F, 0F, 0F, 21, 4, 5, 0F); // Box 33
		gunModel[20].setRotationPoint(7F, -9F, -2.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 34
		gunModel[21].setRotationPoint(43F, -14F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 35
		gunModel[22].setRotationPoint(5F, -9F, -2.5F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 24

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 24
		defaultBarrelModel[0].setRotationPoint(73F, -19F, -1F);


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		defaultStockModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1

		defaultStockModel[0].addBox(0F, 0F, 0F, 25, 5, 5, 0F); // Box 0
		defaultStockModel[0].setRotationPoint(-34F, -20F, -2.5F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 3, 16, 5, 0F); // Box 1
		defaultStockModel[1].setRotationPoint(-37F, -20F, -2.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 29

		ammoModel[0].addBox(0F, 0F, 0F, 12, 3, 14, 0F); // Box 29
		ammoModel[0].setRotationPoint(0F, -19F, 3F);



		barrelAttachPoint = new Vector3f(73F /16F, 18F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(-9F /16F, 18F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(13F /16F, 22F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(35 /16F, 13F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(2 /16F, -1.25F /16F, 0F /16F);


		animationType = EnumAnimationType.SIDE_CLIP;


		endLoadedAmmoDistance = 3F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}