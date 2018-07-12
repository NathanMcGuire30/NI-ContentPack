//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Laser Rifle
// Model Creator: 
// Created on: 29.09.2016 - 11:55:38
// Last changed on: 29.09.2016 - 11:55:38

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLaserRifle1 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLaserRifle1() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 22
		gunModel[20] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Shape 2
		gunModel[22] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Shape 3
		gunModel[23] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 6
		gunModel[24] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 7
		gunModel[25] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 8
		gunModel[26] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 9
		gunModel[27] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 10
		gunModel[28] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 11
		gunModel[29] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 12
		gunModel[30] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 13
		gunModel[31] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 14
		gunModel[32] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 15
		gunModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35

		gunModel[0].addBox(0F, 0F, 0F, 180, 22, 13, 0F); // Box 0
		gunModel[0].setRotationPoint(-66F, -37F, -7F);

		gunModel[1].addBox(0F, 0F, 0F, 148, 4, 15, 0F); // Box 1
		gunModel[1].setRotationPoint(-18F, -37F, -8F);

		gunModel[2].addBox(0F, 0F, 0F, 148, 4, 15, 0F); // Box 2
		gunModel[2].setRotationPoint(-18F, -19F, -8F);

		gunModel[3].addBox(0F, 0F, 0F, 17, 14, 15, 0F); // Box 3
		gunModel[3].setRotationPoint(113F, -33F, -8F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 4
		gunModel[4].setRotationPoint(100F, -33F, -8F);

		gunModel[5].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 5
		gunModel[5].setRotationPoint(88F, -33F, -8F);

		gunModel[6].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 6
		gunModel[6].setRotationPoint(76F, -33F, -8F);

		gunModel[7].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 7
		gunModel[7].setRotationPoint(64F, -33F, -8F);

		gunModel[8].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 8
		gunModel[8].setRotationPoint(51F, -33F, -8F);

		gunModel[9].addBox(0F, 0F, 0F, 4, 14, 15, 0F); // Box 9
		gunModel[9].setRotationPoint(39F, -33F, -8F);

		gunModel[10].addBox(0F, 0F, 0F, 8, 14, 15, 0F); // Box 10
		gunModel[10].setRotationPoint(23F, -33F, -8F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 8, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 11
		gunModel[11].setRotationPoint(15F, -33F, -8F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 6, 15, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(15F, -25F, -8F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 8, 4, 15, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[13].setRotationPoint(-1F, -23F, -8F);

		gunModel[14].addBox(0F, 0F, 0F, 8, 4, 15, 0F); // Box 14
		gunModel[14].setRotationPoint(7F, -23F, -8F);

		gunModel[15].addBox(0F, 0F, 0F, 8, 4, 15, 0F); // Box 15
		gunModel[15].setRotationPoint(7F, -33F, -8F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 16
		gunModel[16].setRotationPoint(-1F, -33F, -8F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 22, 15, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 19
		gunModel[17].setRotationPoint(-25F, -37F, -8F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 30, 3, 15, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 20
		gunModel[18].setRotationPoint(-17F, -15F, -8F);

		gunModel[19].addBox(0F, 0F, 0F, 11, 1, 5, 0F); // Box 22
		gunModel[19].setRotationPoint(-9F, -4F, -3F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 12, 5, 0F); // Box 0
		gunModel[20].setRotationPoint(4F, -15F, -3F);
		gunModel[20].rotateAngleZ = -0.2268928F;

		gunModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(15, 0, 15, 0), new Coord2D(12, 1, 12, 1), new Coord2D(3, 1, 3, 1) }), 196, 15, 1, 32, 196, ModelRendererTurbo.MR_FRONT, new float[] {4 ,9 ,4 ,15}); // Shape 2
		gunModel[21].setRotationPoint(-66F, -37F, 7F);
		gunModel[21].rotateAngleY = 1.57079633F;

		gunModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(15, 0, 15, 0), new Coord2D(12, 1, 12, 1), new Coord2D(3, 1, 3, 1) }), 117, 15, 1, 32, 117, ModelRendererTurbo.MR_FRONT, new float[] {4 ,9 ,4 ,15}); // Shape 3
		gunModel[22].setRotationPoint(13F, -15F, -8F);
		gunModel[22].rotateAngleY = 1.57079633F;
		gunModel[22].rotateAngleZ = -3.14159265F;

		gunModel[23].addBox(0F, 0F, 0F, 24, 26, 15, 0F); // Box 6
		gunModel[23].setRotationPoint(-66F, -15F, -8F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 24, 14, 15, 0F, 0F, -1F, 0F, 1F, -1F, -4F, 1F, -1F, -4F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 3F, 0F); // Box 7
		gunModel[24].setRotationPoint(-42F, -3F, -8F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 14, 7, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 7F, -4F, 0F, -14F, 12F, 0F, -14F, 12F, 0F, 7F, -4F, 0F); // Box 8
		gunModel[25].setRotationPoint(-10F, -12F, -4F);

		gunModel[26].addBox(0F, 0F, 0F, 5, 12, 7, 0F); // Box 9
		gunModel[26].setRotationPoint(-17F, -15F, -4F);

		gunModel[27].addBox(0F, 0F, 0F, 41, 22, 17, 0F); // Box 10
		gunModel[27].setRotationPoint(-66F, -37F, -9F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 24, 11, 15, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[28].setRotationPoint(-66F, -15F, -8F);

		gunModel[29].addBox(0F, 0F, 0F, 4, 44, 13, 0F); // Box 12
		gunModel[29].setRotationPoint(-70F, -35F, -7F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 24, 2, 15, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 13
		gunModel[30].setRotationPoint(-66F, 11F, -8F);

		gunModel[31].addBox(0F, 0F, 0F, 6, 10, 11, 0F); // Box 14
		gunModel[31].setRotationPoint(130F, -31F, -6F);

		gunModel[32].addBox(0F, 0F, 0F, 38, 2, 9, 0F); // Box 15
		gunModel[32].setRotationPoint(3F, -40F, -5F);

		gunModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		gunModel[33].setRotationPoint(0F, -15F, 0F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1

		ammoModel[0].addBox(0F, 0F, 0F, 38, 26, 8, 0F); // Box 0
		ammoModel[0].setRotationPoint(22F, -18F, -4.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 36, 2, 8, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		ammoModel[1].setRotationPoint(24F, 8F, -4.5F);



		barrelAttachPoint = new Vector3f(137F /16F, 28F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(24F /16F, 42F /16F, 0.5F /16F);

		gripAttachPoint = new Vector3f(86 /16F, 16F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(0 /16F, -1F /16F, 0F /16F);


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(1F, -2F, 0F);


		flipAll();
	}
}