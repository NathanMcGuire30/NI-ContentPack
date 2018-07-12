//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M4 Carbine
// Model Creator: 
// Created on: 03.02.2016 - 13:41:05
// Last changed on: 03.02.2016 - 13:41:05

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM4_Carbine extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM4_Carbine() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Barrel
		gunModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Grip
		gunModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Shape 0
		gunModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Shape 1
		gunModel[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Shape 2
		gunModel[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 3
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Shape 4
		gunModel[11] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Shape 5
		gunModel[12] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Shape 6
		gunModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 7
		gunModel[14] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 8
		gunModel[15] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 9
		gunModel[16] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 11

		gunModel[0].addBox(0F, 0F, 0F, 38, 2, 2, 0F); // Barrel
		gunModel[0].setRotationPoint(22F, -10F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 18, 6, 4, 0F); // Box 1
		gunModel[1].setRotationPoint(22F, -12F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 18, 4, 6, 0F); // Box 2
		gunModel[2].setRotationPoint(22F, -11F, -2F);

		gunModel[3].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 3
		gunModel[3].setRotationPoint(20F, -11F, -1F);

		gunModel[4].addBox(0F, 0F, 0F, 26, 8, 4, 0F); // Box 4
		gunModel[4].setRotationPoint(-6F, -12F, -1F);

		gunModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 12, 4, 12), new Coord2D(1, 12, 1, 12) }), 4, 4, 12, 32, 4, ModelRendererTurbo.MR_FRONT, new float[] {13 ,3 ,13 ,3}); // Grip
		gunModel[5].setRotationPoint(5F, -4F, -1F);
		gunModel[5].rotateAngleX = 3.14159265F;

		gunModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 0
		gunModel[6].setRotationPoint(20F, -11F, -1F);
		gunModel[6].rotateAngleX = 1.57079633F;

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 1
		gunModel[7].setRotationPoint(20F, -12F, 3F);

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 2
		gunModel[8].setRotationPoint(20F, -7F, 3F);
		gunModel[8].rotateAngleX = -1.57079633F;

		gunModel[9].addBox(0F, 0F, 0F, 20, 1, 4, 0F); // Box 3
		gunModel[9].setRotationPoint(-3F, -13F, -1F);

		gunModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 4
		gunModel[10].setRotationPoint(-6F, -11F, 3F);
		gunModel[10].rotateAngleX = -1.57079633F;
		gunModel[10].rotateAngleZ = -3.14159265F;

		gunModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 5
		gunModel[11].setRotationPoint(-6F, -12F, -1F);
		gunModel[11].rotateAngleX = -3.14159265F;
		gunModel[11].rotateAngleZ = -3.14159265F;

		gunModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 6
		gunModel[12].setRotationPoint(-6F, -7F, -1F);
		gunModel[12].rotateAngleX = 1.57079633F;
		gunModel[12].rotateAngleZ = -3.14159265F;

		gunModel[13].addBox(0F, 0F, 0F, 20, 4, 6, 0F); // Box 7
		gunModel[13].setRotationPoint(-3F, -11F, -2F);

		gunModel[14].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 8
		gunModel[14].setRotationPoint(9F, -4F, -1F);

		gunModel[15].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 9
		gunModel[15].setRotationPoint(4F, -1F, -1F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 11
		gunModel[16].setRotationPoint(5F, -4F, -1F);


		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		defaultStockModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		defaultStockModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Shape 7

		defaultStockModel[0].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 5
		defaultStockModel[0].setRotationPoint(-9F, -10.5F, -0.5F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 20, 4, 3, 0F); // Box 6
		defaultStockModel[1].setRotationPoint(-29F, -10.5F, -0.5F);

		defaultStockModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(17, 0, 17, 0), new Coord2D(17, 6, 17, 6) }), 3, 17, 6, 42, 3, ModelRendererTurbo.MR_FRONT, new float[] {19 ,6 ,17}); // Shape 7
		defaultStockModel[2].setRotationPoint(-12F, -6.5F, -0.5F);
		defaultStockModel[2].rotateAngleX = 3.14159265F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 10

		ammoModel[0].addBox(0F, 0F, 0F, 10, 21, 3, 0F); // Box 10
		ammoModel[0].setRotationPoint(9.5F, -4F, -0.5F);



		barrelAttachPoint = new Vector3f(60F /16F, 9F /16F, -1F /16F);

		stockAttachPoint = new Vector3f(-6F /16F, 9F /16F, -1F /16F);

		scopeAttachPoint = new Vector3f(7F /16F, 13F /16F, -1F /16F);

		gripAttachPoint = new Vector3f(31 /16F, 6F /16F, -1F /16F);


		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}