//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: handheld cannon
// Model Creator: 
// Created on: 04.10.2017 - 18:31:31
// Last changed on: 04.10.2017 - 18:31:31

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelrailcannon extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelrailcannon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 22
		gunModel[18] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 26
		gunModel[22] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 27
		gunModel[23] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 28
		gunModel[24] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 29
		gunModel[25] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 34
		gunModel[26] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 35
		gunModel[27] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 35
		gunModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		gunModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 37
		gunModel[30] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 38

		gunModel[0].addBox(0F, 0F, 0F, 8, 15, 8, 0F); // Box 0
		gunModel[0].setRotationPoint(-30F, -19F, -4F);

		gunModel[1].addBox(0F, 0F, 0F, 12, 5, 8, 0F); // Box 1
		gunModel[1].setRotationPoint(-22F, -19F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 20, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-30F, -21F, -4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		gunModel[3].setRotationPoint(-30F, -4F, -4F);

		gunModel[4].addBox(0F, 0F, 0F, 12, 7, 6, 0F); // Box 4
		gunModel[4].setRotationPoint(-22F, -13F, -3F);

		gunModel[5].addBox(0F, 0F, 0F, 12, 3, 5, 0F); // Box 5
		gunModel[5].setRotationPoint(-22F, -6F, -2.5F);

		gunModel[6].addBox(0F, 0F, 0F, 13, 2, 7, 0F); // Box 7
		gunModel[6].setRotationPoint(7F, -18F, -3.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 25, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(5F, -21F, -4F);

		gunModel[8].addBox(0F, 0F, 0F, 15, 2, 8, 0F); // Box 9
		gunModel[8].setRotationPoint(-10F, -16F, -4F);

		gunModel[9].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 14
		gunModel[9].setRotationPoint(-5F, -13F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		gunModel[10].setRotationPoint(-22F, -14F, -4F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.4F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.4F, -1F, 0F); // Box 16
		gunModel[11].setRotationPoint(-7F, -9F, -2F);

		gunModel[12].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 17
		gunModel[12].setRotationPoint(-10F, -6F, -2F);
		gunModel[12].rotateAngleZ = -0.26179939F;

		gunModel[13].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 18
		gunModel[13].setRotationPoint(0F, -12F, -1.5F);
		gunModel[13].rotateAngleZ = 0.15707963F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 19
		gunModel[14].setRotationPoint(-3F, -14F, -4F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
		gunModel[15].setRotationPoint(-1F, -14F, -4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 25, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 21
		gunModel[16].setRotationPoint(5F, -13F, -4.5F);

		gunModel[17].addBox(0F, 0F, 0F, 25, 1, 9, 0F); // Box 22
		gunModel[17].setRotationPoint(5F, -14F, -4.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 9, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[18].setRotationPoint(5F, -15F, -4.5F);

		gunModel[19].addBox(0F, 0F, 0F, 35, 2, 5, 0F); // Box 24
		gunModel[19].setRotationPoint(30F, -18.5F, -2.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 35, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[20].setRotationPoint(30F, -19.5F, -2.5F);

		gunModel[21].addBox(0F, 0F, 0F, 35, 1, 6, 0F); // Box 26
		gunModel[21].setRotationPoint(30F, -16.5F, -3F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 35, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 27
		gunModel[22].setRotationPoint(30F, -15.5F, -3F);

		gunModel[23].addBox(0F, 0F, 0F, 21, 1, 4, 0F); // Box 28
		gunModel[23].setRotationPoint(5F, -22F, -2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[24].setRotationPoint(26F, -22F, -2F);

		gunModel[25].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 34
		gunModel[25].setRotationPoint(-10F, -17F, 2F);

		gunModel[26].addBox(0F, 0F, 0F, 15, 1, 2, 0F); // Box 35
		gunModel[26].setRotationPoint(-10F, -17F, -4F);

		gunModel[27].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Box 35
		gunModel[27].setRotationPoint(7F, -19F, -4F);

		gunModel[28].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Box 36
		gunModel[28].setRotationPoint(7F, -16F, -4F);

		gunModel[29].addBox(0F, 0F, 0F, 10, 4, 8, 0F); // Box 37
		gunModel[29].setRotationPoint(20F, -19F, -4F);

		gunModel[30].addBox(0F, 0F, 0F, 2, 4, 8, 0F); // Box 38
		gunModel[30].setRotationPoint(5F, -19F, -4F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 12

		ammoModel[0].addBox(0F, 0F, 0F, 15, 4, 4, 0F); // Box 12
		ammoModel[0].setRotationPoint(-10F, -20F, -2F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 13

		slideModel[0].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 13
		slideModel[0].setRotationPoint(18F, -18F, -5F);


		breakActionModel = new ModelRendererTurbo[6];
		breakActionModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 10
		breakActionModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 11
		breakActionModel[2] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 30
		breakActionModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		breakActionModel[4] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 32
		breakActionModel[5] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 33

		breakActionModel[0].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 10
		breakActionModel[0].setRotationPoint(-10F, -19F, -4F);

		breakActionModel[1].addBox(0F, 0F, 0F, 15, 2, 2, 0F); // Box 11
		breakActionModel[1].setRotationPoint(-10F, -19F, 2F);

		breakActionModel[2].addBox(0F, 0F, 0F, 15, 1, 4, 0F); // Box 30
		breakActionModel[2].setRotationPoint(-10F, -21F, -2F);

		breakActionModel[3].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 31
		breakActionModel[3].setRotationPoint(-10F, -21F, -4F);

		breakActionModel[4].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		breakActionModel[4].setRotationPoint(-10F, -21F, 2F);

		breakActionModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		breakActionModel[5].setRotationPoint(1F, -22F, -2F);



		barrelAttachPoint = new Vector3f(65F /16F, 17F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(17F /16F, 11F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(16F /16F, 22F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(17 /16F, 11F /16F, 0F /16F);

		thirdPersonOffset = new Vector3f(0 /16F, -1.3F /16F, 0F /16F);

		gunSlideDistance = 0.8F;
		animationType = EnumAnimationType.BREAK_ACTION;
		endLoadedAmmoDistance = 20F;

		barrelBreakPoint = new Vector3f(5 /16F, 22F /16F, 0F /16F);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}