//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Arrow Rocket Launcher
// Model Creator: 
// Created on: 02.02.2016 - 13:02:38
// Last changed on: 02.02.2016 - 13:02:38

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArrow_Rocket_Launcher extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelArrow_Rocket_Launcher() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[9];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Barrel - Right
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Barrel - Left
		gunModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		gunModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Rail
		gunModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Rail - Front
		gunModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Rail - Rear

		gunModel[0].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 0
		gunModel[0].setRotationPoint(3F, -9F, -3F);
		gunModel[0].rotateAngleZ = -0.19198622F;

		gunModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(5, 2, 5, 2), new Coord2D(5, 8, 5, 8), new Coord2D(3, 10, 3, 10), new Coord2D(0, 10, 0, 10) }), 130, 5, 10, 28, 130, ModelRendererTurbo.MR_FRONT, new float[] {10 ,3 ,3 ,6 ,3 ,3}); // Barrel - Right
		gunModel[1].setRotationPoint(-95F, -8F, 0F);
		gunModel[1].rotateAngleY = 1.57079633F;

		gunModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(5, 2, 5, 2), new Coord2D(5, 8, 5, 8), new Coord2D(3, 10, 3, 10), new Coord2D(0, 10, 0, 10) }), 130, 6, 10, 28, 130, ModelRendererTurbo.MR_FRONT, new float[] {10 ,3 ,3 ,6 ,3 ,3}); // Barrel - Left
		gunModel[2].setRotationPoint(35F, -8F, 0F);
		gunModel[2].rotateAngleY = -1.57079633F;

		gunModel[3].addBox(0F, 0F, 0F, 25, 14, 1, 0F); // Box 6
		gunModel[3].setRotationPoint(6F, -19F, -6F);

		gunModel[4].addBox(0F, 0F, 0F, 25, 3, 10, 0F); // Box 7
		gunModel[4].setRotationPoint(6F, -19F, -5F);

		gunModel[5].addBox(0F, 0F, 0F, 25, 5, 10, 0F); // Box 8
		gunModel[5].setRotationPoint(6F, -10F, -5F);

		gunModel[6].addBox(0F, 0F, 0F, 19, 6, 1, 0F); // Rail
		gunModel[6].setRotationPoint(9F, -19F, 5F);

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 6, 3, 1, 8, 6, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Rail - Front
		gunModel[7].setRotationPoint(31F, -13F, 5F);
		gunModel[7].rotateAngleX = -1.57079633F;

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 6, 3, 1, 8, 6, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Rail - Rear
		gunModel[8].setRotationPoint(6F, -19F, 5F);
		gunModel[8].rotateAngleX = -1.57079633F;
		gunModel[8].rotateAngleZ = 3.14159265F;


		defaultScopeModel = new ModelRendererTurbo[2];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 13
		defaultScopeModel[1] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 14

		defaultScopeModel[0].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 13
		defaultScopeModel[0].setRotationPoint(12F, -18F, 6F);

		defaultScopeModel[1].addBox(0F, 0F, 0F, 19, 6, 6, 0F); // Box 14
		defaultScopeModel[1].setRotationPoint(9F, -19F, 7F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Ammo

		ammoModel[0].addBox(0F, 0F, 0F, 25, 22, 8, 0F); // Ammo
		ammoModel[0].setRotationPoint(-31F, -10F, -4F);



		stockAttachPoint = new Vector3f(20F /16F, -3F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(19F /16F, 16F /16F, 6F /16F);

		gripAttachPoint = new Vector3f(20 /16F, 5F /16F, 0F /16F);


		gunSlideDistance = 0.1F;


		animationType = EnumAnimationType.GENERIC;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}