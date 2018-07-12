//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI Rail Sniper Rifle
// Model Creator: 
// Created on: 11.11.2017 - 12:17:53
// Last changed on: 11.11.2017 - 12:17:53

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelrailsniperStock extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelrailsniperStock() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[5];
		attachmentModel[0] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 36
		attachmentModel[1] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 37
		attachmentModel[2] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 38
		attachmentModel[3] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 39
		attachmentModel[4] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 40

		attachmentModel[0].addBox(0F, 0F, 0F, 25, 5, 6, 0F); // Box 36
		attachmentModel[0].setRotationPoint(-25F, -2F, -3F);

		attachmentModel[1].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 37
		attachmentModel[1].setRotationPoint(-28F, -2F, -3F);

		attachmentModel[2].addBox(0F, 0F, 0F, 21, 5, 4, 0F); // Box 38
		attachmentModel[2].setRotationPoint(-25F, 3F, -2F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 17, 3, 4, 0F, -10.5F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -10.5F, 0.2F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F); // Box 39
		attachmentModel[3].setRotationPoint(-14F, 4.85F, -2F);
		attachmentModel[3].rotateAngleZ = -0.32114058F;

		attachmentModel[4].addBox(0F, 0F, 0F, 17, 7, 8, 0F); // Box 40
		attachmentModel[4].setRotationPoint(-23F, 0F, -4F);



		flipAll();
	}
}