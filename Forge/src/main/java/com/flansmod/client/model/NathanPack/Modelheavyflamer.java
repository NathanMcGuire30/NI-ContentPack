//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: heavyflamer
// Model Creator: 
// Created on: 09.10.2017 - 09:55:23
// Last changed on: 09.10.2017 - 09:55:23

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelheavyflamer extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelheavyflamer() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[14];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box2
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box3
		gunModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 1
		gunModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 2
		gunModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		gunModel[6] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 4
		gunModel[7] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 5
		gunModel[8] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 6
		gunModel[9] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 7
		gunModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 13

		gunModel[0].addBox(0F, 0F, 0F, 5, 9, 6, 0F); // Import Box2
		gunModel[0].setRotationPoint(0F, -14.5F, -3F);

		gunModel[1].addBox(0F, 0F, 0F, 41, 17, 7, 0F); // Import Box3
		gunModel[1].setRotationPoint(5F, -15.5F, -3.5F);

		gunModel[2].addBox(0F, 0F, 0F, 32, 17, 9, 0F); // Box 0
		gunModel[2].setRotationPoint(10F, -14.5F, -4.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 32, 3, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[3].setRotationPoint(10F, -17.5F, -4.5F);

		gunModel[4].addBox(0F, 0F, 0F, 18, 5, 5, 0F); // Box 2
		gunModel[4].setRotationPoint(46F, -14.5F, -2.5F);

		gunModel[5].addBox(0F, 0F, 0F, 18, 5, 5, 0F); // Box 3
		gunModel[5].setRotationPoint(46F, -8.5F, -2.5F);

		gunModel[6].addBox(0F, 0F, 0F, 18, 10, 7, 0F); // Box 4
		gunModel[6].setRotationPoint(64F, -14F, -3.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[7].setRotationPoint(64F, -16F, -3.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 18, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 6
		gunModel[8].setRotationPoint(64F, -4F, -3.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 32, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		gunModel[9].setRotationPoint(10F, 2.5F, -4.5F);

		gunModel[10].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 10
		gunModel[10].setRotationPoint(12F, 4F, -3F);

		gunModel[11].addBox(0F, 0F, 0F, 7, 15, 7, 0F); // Box 11
		gunModel[11].setRotationPoint(11.5F, 6F, -3.5F);

		gunModel[12].addBox(0F, 0F, 0F, 32, 12, 13, 0F); // Box 12
		gunModel[12].setRotationPoint(7F, -13.5F, -6.5F);

		gunModel[13].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Box 13
		gunModel[13].setRotationPoint(82F, -13.5F, -2.5F);


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box0
		defaultStockModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box1

		defaultStockModel[0].addBox(0F, 0F, 0F, 25, 5, 5, 0F); // Import Box0
		defaultStockModel[0].setRotationPoint(-25F, -14F, -2.5F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 3, 16, 5, 0F); // Import Box1
		defaultStockModel[1].setRotationPoint(-28F, -14F, -2.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		ammoModel[1] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 9

		ammoModel[0].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 8
		ammoModel[0].setRotationPoint(33F, 4F, -3F);
		ammoModel[0].rotateAngleZ = 0.2443461F;

		ammoModel[1].addBox(0F, 0F, 0F, 8, 20, 8, 0F); // Box 9
		ammoModel[1].setRotationPoint(32F, 6F, -4F);
		ammoModel[1].rotateAngleZ = 0.2443461F;



		stockAttachPoint = new Vector3f(0F /16F, 12F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(25F /16F, 17F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(31 /16F, -4F /16F, 0F /16F);


		animationType = EnumAnimationType.BOTTOM_CLIP;


		endLoadedAmmoDistance = 4F;


		spinPoint = new Vector3f(0 /16F, -15F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}