//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mercury SMG
// Model Creator: 
// Created on: 11.09.2017 - 11:48:41
// Last changed on: 11.09.2017 - 11:48:41

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelmercurysmg extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelmercurysmg() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 17
		gunModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 18

		gunModel[0].addBox(0F, 0F, 0F, 64, 6, 6, 0F); // Box 0
		gunModel[0].setRotationPoint(-26F, -19F, -3F);

		gunModel[1].addBox(0F, 0F, 0F, 15, 8, 8, 0F); // Box 1
		gunModel[1].setRotationPoint(-20F, -16F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 14, 8, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-26F, -19F, -4F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 14, 8, 0F); // Box 3
		gunModel[3].setRotationPoint(-28F, -19F, -4F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 11, 8, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-5F, -19F, -4F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-2F, -22F, -4F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 6, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(5F, -22F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(2F, -13F, -2F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 9
		gunModel[8].setRotationPoint(1F, -4F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 11, 8, 4, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -11F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(-10F, -8F, -2F);

		gunModel[10].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 11
		gunModel[10].setRotationPoint(-22F, -8F, -2F);

		gunModel[11].addBox(0F, 0F, 0F, 22, 1, 4, 0F); // Box 12
		gunModel[11].setRotationPoint(12F, -22F, -2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F); // Box 13
		gunModel[12].setRotationPoint(34F, -22F, -2F);

		gunModel[13].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 14
		gunModel[13].setRotationPoint(38F, -17.5F, -1.5F);

		gunModel[14].addBox(0F, 0F, 0F, 36, 1, 4, 0F); // Box 17
		gunModel[14].setRotationPoint(-2F, -13F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[15].setRotationPoint(34F, -13F, -2F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 15
		ammoModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 16

		ammoModel[0].addBox(0F, 0F, 0F, 11, 12, 3, 0F); // Box 15
		ammoModel[0].setRotationPoint(-20F, -7F, -1.5F);

		ammoModel[1].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 16
		ammoModel[1].setRotationPoint(-20F, 5F, -2F);



		barrelAttachPoint = new Vector3f(43F /16F, 16F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(24F /16F, 22F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(16 /16F, 12F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(0 /16F, -1F /16F, 0F /16F);


		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}