//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RailRifle
// Model Creator: 
// Created on: 14.12.2018 - 15:21:52
// Last changed on: 14.12.2018 - 15:21:52

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRailRifle extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRailRifle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[25];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box3
		gunModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box4
		gunModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box5
		gunModel[6] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box7
		gunModel[7] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Import Shape9
		gunModel[8] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Import Shape10
		gunModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Shape12
		gunModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Shape15
		gunModel[11] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Import Shape16
		gunModel[12] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Import Shape17
		gunModel[13] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Import Shape18
		gunModel[14] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Shape19
		gunModel[15] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Shape20
		gunModel[16] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Import Shape21
		gunModel[17] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Import Trigger
		gunModel[18] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Import Box23
		gunModel[19] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Import Shape24
		gunModel[20] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Shape25
		gunModel[21] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Import Box30
		gunModel[22] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Import Shape31
		gunModel[23] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 1

		gunModel[0].addBox(0F, 0F, 0F, 70, 2, 10, 0F); // Import Box0
		gunModel[0].setRotationPoint(-27F, -11F, -5F);

		gunModel[1].addBox(0F, 0F, 0F, 13, 3, 6, 0F); // Import Box1
		gunModel[1].setRotationPoint(1F, -8F, -3F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 10, 6, 0F); // Import Box2
		gunModel[2].setRotationPoint(3F, -6F, -3F);
		gunModel[2].rotateAngleZ = -0.27925268F;

		gunModel[3].addBox(0F, 0F, 0F, 71, 4, 4, 0F); // Import Box3
		gunModel[3].setRotationPoint(-28F, -15F, -2F);

		gunModel[4].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Import Box4
		gunModel[4].setRotationPoint(1F, -9F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 28, 1, 10, 0F); // Import Box5
		gunModel[5].setRotationPoint(-27F, -9F, -5F);

		gunModel[6].addBox(0F, 0F, 0F, 13, 8, 6, 0F); // Import Box7
		gunModel[6].setRotationPoint(-27F, -9F, -3F);

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 1, 6, 1) }), 6, 6, 1, 14, 6, ModelRendererTurbo.MR_FRONT, new float[] {7 ,1 ,6}); // Import Shape9
		gunModel[7].setRotationPoint(-27F, -7F, 3F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 6, 4, 1, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape10
		gunModel[8].setRotationPoint(-27F, -7F, -3F);
		gunModel[8].rotateAngleX = 3.14159265F;
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Import Shape12
		gunModel[9].setRotationPoint(1F, -8F, -2F);
		gunModel[9].rotateAngleY = -3.14159265F;
		gunModel[9].rotateAngleZ = 3.14159265F;

		gunModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape15
		gunModel[10].setRotationPoint(-27F, -15F, 2F);
		gunModel[10].rotateAngleY = -1.57079633F;
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape16
		gunModel[11].setRotationPoint(-28F, -15F, -2F);
		gunModel[11].rotateAngleY = 1.57079633F;
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 10, 4, 3, 12, 10, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Import Shape17
		gunModel[12].setRotationPoint(-27F, -15F, -2F);
		gunModel[12].rotateAngleY = 1.57079633F;
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 42, 3, 1, 8, 42, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Import Shape18
		gunModel[13].setRotationPoint(43F, -9F, 5F);
		gunModel[13].rotateAngleY = -1.57079633F;
		gunModel[13].rotateAngleZ = 3.14159265F;

		gunModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 42, 3, 1, 8, 42, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Import Shape19
		gunModel[14].setRotationPoint(1F, -9F, -5F);
		gunModel[14].rotateAngleY = 1.57079633F;
		gunModel[14].rotateAngleZ = 3.14159265F;

		gunModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 1, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Import Shape20
		gunModel[15].setRotationPoint(-14F, -8F, 5F);
		gunModel[15].rotateAngleY = -1.57079633F;
		gunModel[15].rotateAngleZ = 3.14159265F;

		gunModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 2, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Import Shape21
		gunModel[16].setRotationPoint(-27F, -8F, -5F);
		gunModel[16].rotateAngleY = 1.57079633F;
		gunModel[16].rotateAngleZ = 3.14159265F;

		gunModel[17].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Import Trigger
		gunModel[17].setRotationPoint(6F, -5F, -1F);

		gunModel[18].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Import Box23
		gunModel[18].setRotationPoint(9F, -16F, -2F);

		gunModel[19].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape24
		gunModel[19].setRotationPoint(41F, -15F, 2F);

		gunModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape25
		gunModel[20].setRotationPoint(7F, -15F, -2F);
		gunModel[20].rotateAngleY = 3.14159265F;

		gunModel[21].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Import Box30
		gunModel[21].setRotationPoint(14F, -8F, -2F);

		gunModel[22].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape31
		gunModel[22].setRotationPoint(41F, -8F, -2F);
		gunModel[22].rotateAngleX = 3.14159265F;

		gunModel[23].addBox(0F, 0F, 0F, 57, 4, 3, 0F); // Box 0
		gunModel[23].setRotationPoint(-14F, -15F, 2F);

		gunModel[24].addBox(0F, 0F, 0F, 57, 4, 3, 0F); // Box 1
		gunModel[24].setRotationPoint(-14F, -15F, -5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Import Box6

		ammoModel[0].addBox(0F, 0F, 0F, 12, 13, 4, 0F); // Import Box6
		ammoModel[0].setRotationPoint(-14F, -8F, -2F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}