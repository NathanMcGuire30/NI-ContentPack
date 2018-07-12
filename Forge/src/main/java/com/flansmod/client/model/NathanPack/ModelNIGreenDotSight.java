//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Reflex Sight
// Model Creator: 
// Created on: 09.09.2017 - 15:37:45
// Last changed on: 09.09.2017 - 15:37:45

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIGreenDotSight extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNIGreenDotSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[9];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8

		attachmentModel[0].addBox(0F, 0F, 0F, 30, 2, 10, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-14F, -2F, -5F);

		attachmentModel[1].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-14F, -11F, -6F);

		attachmentModel[2].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-14F, -11F, 5F);

		attachmentModel[3].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-14F, -12F, -5F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-9F, -11F, 5F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(-9F, -11F, -6F);

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(-9F, -2F, -6F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[7].setRotationPoint(-9F, -2F, 5F);

		attachmentModel[8].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 8
		attachmentModel[8].setRotationPoint(-12F, -7F, -0.5F);



		flipAll();
	}
}