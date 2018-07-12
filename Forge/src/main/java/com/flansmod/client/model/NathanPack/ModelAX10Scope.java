//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: handheld cannon
// Model Creator: 
// Created on: 04.10.2017 - 18:31:31
// Last changed on: 04.10.2017 - 18:31:31

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAX10Scope extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAX10Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[11];
		attachmentModel[0] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 39
		attachmentModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 40
		attachmentModel[2] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 41
		attachmentModel[3] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 42
		attachmentModel[4] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 43
		attachmentModel[5] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 44
		attachmentModel[6] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 45
		attachmentModel[7] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 46
		attachmentModel[8] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 47
		attachmentModel[9] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 48
		attachmentModel[10] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 49

		attachmentModel[0].addBox(0F, 0F, 0F, 13, 4, 5, 0F); // Box 39
		attachmentModel[0].setRotationPoint(-11F, -5F, -2.5F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		attachmentModel[1].setRotationPoint(-11F, -6F, -1.5F);

		attachmentModel[2].addBox(0F, 0F, 0F, 6, 1, 3, 0F); // Box 41
		attachmentModel[2].setRotationPoint(-9F, -6F, -1.5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		attachmentModel[3].setRotationPoint(-3F, -6F, -1.5F);

		attachmentModel[4].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 43
		attachmentModel[4].setRotationPoint(-3F, -1F, -2F);

		attachmentModel[5].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 44
		attachmentModel[5].setRotationPoint(2F, -4.5F, -1.5F);

		attachmentModel[6].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 45
		attachmentModel[6].setRotationPoint(7F, -4F, -2F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		attachmentModel[7].setRotationPoint(7F, -5F, -2F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 47
		attachmentModel[8].setRotationPoint(7F, -2F, -2F);

		attachmentModel[9].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 48
		attachmentModel[9].setRotationPoint(-3F, -4F, -3F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 49
		attachmentModel[10].setRotationPoint(-6F, -4F, -3F);

		flipAll();
	}
}