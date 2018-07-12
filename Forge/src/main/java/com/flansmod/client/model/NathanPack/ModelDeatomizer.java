//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Deatomizer
// Model Creator: 
// Created on: 27.09.2016 - 17:50:47
// Last changed on: 27.09.2016 - 17:50:47

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDeatomizer extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDeatomizer() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 1
		gunModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		gunModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 3
		gunModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		gunModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		gunModel[24] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 27

		gunModel[0].addBox(0F, 0F, 0F, 5, 19, 5, 0F); // Box 0
		gunModel[0].setRotationPoint(1.5F, -11.2F, -2.5F);
		gunModel[0].rotateAngleZ = -0.08726646F;

		gunModel[1].addBox(0F, 0F, 0F, 43, 11, 9, 0F); // Box 1
		gunModel[1].setRotationPoint(-28F, -18F, -4.5F);

		gunModel[2].addBox(0F, 0F, 0F, 26, 5, 7, 0F); // Box 2
		gunModel[2].setRotationPoint(19F, -15F, -3.5F);

		gunModel[3].addBox(0F, 0F, 0F, 30, 1, 9, 0F); // Box 3
		gunModel[3].setRotationPoint(15F, -16F, -4.5F);

		gunModel[4].addBox(0F, 0F, 0F, 30, 1, 9, 0F); // Box 4
		gunModel[4].setRotationPoint(15F, -10F, -4.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 26, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(19F, -18F, -4.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(15F, -15F, -4.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(15F, -18F, -4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(15F, -9F, -4.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 26, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		gunModel[9].setRotationPoint(19F, -9F, -4.5F);

		gunModel[10].addBox(0F, 0F, 0F, 43, 7, 10, 0F); // Box 10
		gunModel[10].setRotationPoint(-28F, -16F, -5F);

		gunModel[11].addBox(0F, 0F, 0F, 67, 13, 4, 0F); // Box 11
		gunModel[11].setRotationPoint(-28F, -19F, -2F);

		gunModel[12].addBox(0F, 0F, 0F, 21, 6, 1, 0F); // Box 12
		gunModel[12].setRotationPoint(-7F, -15.5F, 4.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(45F, -15F, -3.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 15
		gunModel[14].setRotationPoint(45F, -18F, -3.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 16
		gunModel[15].setRotationPoint(45F, -16F, -3.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 17
		gunModel[16].setRotationPoint(45F, -10F, -3.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 18
		gunModel[17].setRotationPoint(45F, -9F, -3.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		gunModel[18].setRotationPoint(-30F, -18F, -4.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[19].setRotationPoint(-30F, -12F, -4.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 2
		gunModel[20].setRotationPoint(-30F, -7F, -2F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[21].setRotationPoint(-30F, -19F, -2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[22].setRotationPoint(-29F, -16F, -5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 5
		gunModel[23].setRotationPoint(-29F, -16F, 4F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[24].setRotationPoint(39F, -19F, -2F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 13

		ammoModel[0].addBox(0F, 0F, 0F, 19, 4, 13, 0F); // Box 13
		ammoModel[0].setRotationPoint(-6F, -14.5F, 5F);


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 19
		slideModel[1] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 20

		slideModel[0].addBox(1F, 2F, 2F, 19, 3, 3, 0F); // Box 19
		slideModel[0].setRotationPoint(45F, -16F, -3.5F);

		slideModel[1].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 20
		slideModel[1].setRotationPoint(65F, -14.5F, -2F);



		scopeAttachPoint = new Vector3f(8F /16F, 19F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(30 /16F, 6F /16F, 0F /16F);


		gunSlideDistance = 3F;


		animationType = EnumAnimationType.SIDE_CLIP;


		unloadClipTime = 0.5F;


		loadClipTime = 1F;


		endLoadedAmmoDistance = 10F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}