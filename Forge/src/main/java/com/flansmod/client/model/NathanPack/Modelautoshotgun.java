//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI 603X Shotgun
// Model Creator: 
// Created on: 10.09.2017 - 10:05:13
// Last changed on: 10.09.2017 - 10:05:13

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelautoshotgun extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelautoshotgun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 17
		gunModel[12] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 18
		gunModel[13] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 35
		gunModel[30] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 36

		gunModel[0].addBox(0F, 0F, 0F, 16, 7, 6, 0F); // Box 0
		gunModel[0].setRotationPoint(-2F, -14F, -10F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 14, 5, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(-5F, -7F, -9.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 36, 2, 6, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(-2F, -16F, -10F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 5, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(0F, -18F, -9.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		gunModel[4].setRotationPoint(11F, -7F, -10F);

		gunModel[5].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 11
		gunModel[5].setRotationPoint(68F, -12F, -8F);

		gunModel[6].addBox(0F, 0F, 0F, 37, 3, 10, 0F); // Box 12
		gunModel[6].setRotationPoint(31F, -13.5F, -12F);

		gunModel[7].addBox(0F, 0F, 0F, 48, 1, 3, 0F); // Box 13
		gunModel[7].setRotationPoint(20F, -19F, -8.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 14
		gunModel[8].setRotationPoint(21F, -18.5F, -5.5F);

		gunModel[9].addBox(0F, 0F, 0F, 28, 2, 2, 0F); // Box 15
		gunModel[9].setRotationPoint(26F, -17F, -8F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[10].setRotationPoint(38F, -18.5F, -5.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[11].setRotationPoint(42F, -18.5F, -5.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[12].setRotationPoint(46F, -18.5F, -5.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[13].setRotationPoint(50F, -18.5F, -5.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[14].setRotationPoint(54F, -18.5F, -5.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[15].setRotationPoint(58F, -18.5F, -5.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[16].setRotationPoint(65F, -18.5F, -5.5F);

		gunModel[17].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 23
		gunModel[17].setRotationPoint(51F, -15F, -8F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -10F, 0F, -2.5F); // Box 24
		gunModel[18].setRotationPoint(21F, -18.5F, -11.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 25
		gunModel[19].setRotationPoint(38F, -18.5F, -11.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 26
		gunModel[20].setRotationPoint(42F, -18.5F, -11.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 27
		gunModel[21].setRotationPoint(46F, -18.5F, -11.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 28
		gunModel[22].setRotationPoint(50F, -18.5F, -11.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 29
		gunModel[23].setRotationPoint(54F, -18.5F, -11.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 30
		gunModel[24].setRotationPoint(58F, -18.5F, -11.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 31
		gunModel[25].setRotationPoint(65F, -18.5F, -11.5F);

		gunModel[26].addBox(0F, 0F, 0F, 35, 1, 4, 0F); // Box 32
		gunModel[26].setRotationPoint(33F, -7F, -9F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 37, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 33
		gunModel[27].setRotationPoint(31F, -10.5F, -11.5F);

		gunModel[28].addBox(0F, 0F, 0F, 38, 7, 6, 0F); // Box 34
		gunModel[28].setRotationPoint(30F, -14F, -10F);

		gunModel[29].addBox(0F, 0F, 0F, 16, 7, 1, 0F); // Box 35
		gunModel[29].setRotationPoint(14F, -14F, -5F);

		gunModel[30].addBox(0F, 0F, 0F, 16, 3, 5, 0F); // Box 36
		gunModel[30].setRotationPoint(14F, -10F, -10F);


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 9
		defaultStockModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 10

		defaultStockModel[0].addBox(0F, 0F, 0F, 25, 5, 5, 0F); // Box 9
		defaultStockModel[0].setRotationPoint(-27F, -13F, -9.5F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 3, 16, 5, 0F); // Box 10
		defaultStockModel[1].setRotationPoint(-30F, -13F, -9.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 8

		ammoModel[0].addBox(0F, 0F, 0F, 16, 28, 4, 0F); // Box 8
		ammoModel[0].setRotationPoint(14F, -6F, -9F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37

		slideModel[0].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 37
		slideModel[0].setRotationPoint(14F, -12F, -7F);



		barrelAttachPoint = new Vector3f(72F /16F, 17F /16F, 0F /16F);

		stockAttachPoint = new Vector3f(-8F /16F, 17F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(27F /16F, 25F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(36 /16F, 12F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(0 /16F, -1F /16F, 0F /16F);


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(-6F, -6F, 7F);


		flipAll();
	}
}