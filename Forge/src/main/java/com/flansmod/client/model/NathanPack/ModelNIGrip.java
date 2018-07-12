//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI GR-02 Advanced Hand Grip
// Model Creator: 
// Created on: 10.09.2017 - 14:28:46
// Last changed on: 10.09.2017 - 14:28:46

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIGrip extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNIGrip() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[4];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3

		attachmentModel[0].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-8F, 0F, -3F);

		attachmentModel[1].addBox(0F, 0F, 0F, 6, 17, 6, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-3.5F, 1F, -3F);

		attachmentModel[2].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-8F, -1F, -3F);

		attachmentModel[3].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-8F, -1F, 2F);



		flipAll();
	}
}