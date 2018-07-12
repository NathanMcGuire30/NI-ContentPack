//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AUG
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAUG extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelAUG() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Import 
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import 
		gunModel[2] = new ModelRendererTurbo(this, 13, 2, textureX, textureY); // Import 
		gunModel[3] = new ModelRendererTurbo(this, 21, 7, textureX, textureY); // Import 
		gunModel[4] = new ModelRendererTurbo(this, 8, 12, textureX, textureY); // Import 
		gunModel[5] = new ModelRendererTurbo(this, 24, 1, textureX, textureY); // Import 
		gunModel[6] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Import 
		gunModel[7] = new ModelRendererTurbo(this, 27, 4, textureX, textureY); // Import 
		gunModel[8] = new ModelRendererTurbo(this, 23, 13, textureX, textureY); // Import 
		gunModel[9] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Import 
		gunModel[10] = new ModelRendererTurbo(this, 5, 22, textureX, textureY); // Import 

		gunModel[0].addBox(-6F, -3.25F, -3.25F, 8, 2, 2, 0F); // Import 
		gunModel[0].setRotationPoint(0F, 0F, 0F);
		gunModel[0].rotateAngleX = -0.78539816F;

		gunModel[1].addShapeBox(-7F, -3F, -1F, 4, 4, 2, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Import 
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-3F, -3.5F, -1F, 4, 2, 2, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Import 
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-0.4F, -3F, -0.5F, 2, 4, 1, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import 
		gunModel[3].setRotationPoint(0F, 0F, 0F);
		gunModel[3].rotateAngleZ = -0.13962634F;

		gunModel[4].addShapeBox(2F, -3F, -3F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import 
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		gunModel[4].rotateAngleX = -0.78539816F;

		gunModel[5].addShapeBox(7F, -3.4F, -0.5F, 2, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-1.5F, -5F, -0.5F, 8, 2, 1, 0F); // Import 
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(6.5F, -5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(4.5F, -2.6F, -0.5F, 3, 1, 1, 0F); // Import 
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(-2.5F, -5F, -0.5F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-7F, -3.25F, -3.25F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Import 
		gunModel[10].setRotationPoint(0F, 0F, 0F);
		gunModel[10].rotateAngleX = -0.78539816F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Import 

		ammoModel[0].addBox(-4F, -2.7F, -0.5F, 2, 4, 1, 0F); // Import 
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleZ = 0.15707963F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 19, 17, textureX, textureY); // Import 
		slideModel[1] = new ModelRendererTurbo(this, 19, 17, textureX, textureY); // Import 

		slideModel[0].addShapeBox(3F, -4.1F, 0.4F, 1, 1, 1, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import 
		slideModel[0].setRotationPoint(0F, 0F, 0F);

		slideModel[1].addShapeBox(3F, -4.1F, -1.4F, 1, 1, 1, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import 
		slideModel[1].setRotationPoint(0F, 0F, 0F);



		barrelAttachPoint = new Vector3f(10F /16F, 3F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(4F /16F, 5F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(6 /16F, 2F /16F, 0F /16F);


		translateAll(1F, 0F, 0F);


		flipAll();
	}
}