//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AX9 Scope
// Model Creator: 
// Created on: 08.09.2017 - 11:59:33
// Last changed on: 08.09.2017 - 11:59:33

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAX9Scope extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAX9Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[11];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 6
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		attachmentModel[7] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 8
		attachmentModel[8] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 9
		attachmentModel[9] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 10
		attachmentModel[10] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 11

		attachmentModel[0].addBox(0F, 0F, 0F, 40, 20, 20, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-26F, -22F, -10F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 40, 20, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-26F, -22F, -14F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 40, 20, 4, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-26F, -2F, 14F);
		attachmentModel[2].rotateAngleX = 3.14159265F;

		attachmentModel[3].addBox(0F, 0F, 0F, 65, 6, 12, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-33F, -16F, -6F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 65, 4, 12, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-33F, -20F, -6F);

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 65, 4, 12, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[5].setRotationPoint(-33F, -6F, 6F);
		attachmentModel[5].rotateAngleX = 3.14159265F;

		attachmentModel[6].addBox(0F, 0F, 0F, 30, 7, 13, 0F); // Box 7
		attachmentModel[6].setRotationPoint(32F, -16.5F, -6.5F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 30, 4, 13, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		attachmentModel[7].setRotationPoint(32F, -20.5F, -6.5F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 30, 4, 13, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		attachmentModel[8].setRotationPoint(32F, -5.5F, 6.5F);
		attachmentModel[8].rotateAngleX = 3.14159265F;

		attachmentModel[9].addBox(0F, 0F, 0F, 27, 2, 18, 0F); // Box 10
		attachmentModel[9].setRotationPoint(-15F, -2F, -9F);

		attachmentModel[10].addBox(0F, 0F, 0F, 34, 18, 7, 0F); // Box 11
		attachmentModel[10].setRotationPoint(-23F, -21F, 14F);



		flipAll();
	}
}