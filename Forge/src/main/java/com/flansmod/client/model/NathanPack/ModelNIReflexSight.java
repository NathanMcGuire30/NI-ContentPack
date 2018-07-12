//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NIReflexSight
// Model Creator: 
// Created on: 07.09.2017 - 17:17:33
// Last changed on: 07.09.2017 - 17:17:33

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIReflexSight extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNIReflexSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[16];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15

		attachmentModel[0].addBox(0F, 0F, 0F, 110, 2, 30, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-55F, -2F, -15F);

		attachmentModel[1].addBox(0F, 0F, 0F, 110, 30, 1, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-55F, -40F, -24F);

		attachmentModel[2].addBox(0F, 0F, 0F, 110, 1, 30, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-55F, -49F, -15F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 110, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-55F, -10F, -24F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 110, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-55F, -49F, -15F);
		attachmentModel[4].rotateAngleX = -1.57079633F;

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 110, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(-55F, -1F, 15F);
		attachmentModel[5].rotateAngleX = 1.57079633F;

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 110, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(-55F, -40F, 24F);
		attachmentModel[6].rotateAngleX = 3.14159265F;

		attachmentModel[7].addBox(0F, 0F, 0F, 110, 30, 1, 0F); // Box 7
		attachmentModel[7].setRotationPoint(-55F, -40F, 23F);

		attachmentModel[8].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 8
		attachmentModel[8].setRotationPoint(-50F, -25F, -9F);

		attachmentModel[9].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 9
		attachmentModel[9].setRotationPoint(-50F, -25F, 2F);

		attachmentModel[10].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 10
		attachmentModel[10].setRotationPoint(-50F, -22.5F, -0.5F);

		attachmentModel[11].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 11
		attachmentModel[11].setRotationPoint(-50F, -33.5F, -0.5F);

		attachmentModel[12].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 12
		attachmentModel[12].setRotationPoint(49F, -33F, -0.5F);

		attachmentModel[13].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 13
		attachmentModel[13].setRotationPoint(49F, -25F, -8.5F);

		attachmentModel[14].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 14
		attachmentModel[14].setRotationPoint(49F, -25F, 1.5F);

		attachmentModel[15].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 15
		attachmentModel[15].setRotationPoint(49F, -23F, -0.5F);



		flipAll();
	}
}