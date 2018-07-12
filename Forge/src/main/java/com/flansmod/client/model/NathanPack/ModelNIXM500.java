//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NIXM500
// Model Creator: 
// Created on: 28.01.2016 - 15:11:03
// Last changed on: 28.01.2016 - 15:11:03

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIXM500 extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelNIXM500() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Shape 9
		gunModel[8] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Shape 10
		gunModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Shape 12
		gunModel[10] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Shape 14
		gunModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Shape 15
		gunModel[12] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Shape 16
		gunModel[13] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Shape 17
		gunModel[14] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Shape 18
		gunModel[15] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Shape 19
		gunModel[16] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Shape 20
		gunModel[17] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Shape 21
		gunModel[18] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Trigger
		gunModel[19] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 23
		gunModel[20] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Shape 24
		gunModel[21] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Shape 25
		gunModel[22] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 30
		gunModel[24] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Shape 31
		gunModel[25] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Shape 27
		gunModel[26] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 29
		gunModel[28] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 30

		gunModel[0].addBox(0F, 0F, 0F, 70, 2, 10, 0F); // Box 0
		gunModel[0].setRotationPoint(-27F, -9F, -5F);

		gunModel[1].addBox(0F, 0F, 0F, 13, 3, 6, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, -6F, -3F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 10, 6, 0F); // Box 2
		gunModel[2].setRotationPoint(3F, -4F, -3F);
		gunModel[2].rotateAngleZ = -0.27925268F;

		gunModel[3].addBox(0F, 0F, 0F, 71, 4, 4, 0F); // Box 3
		gunModel[3].setRotationPoint(-28F, -13F, -2F);

		gunModel[4].addBox(0F, 0F, 0F, 42, 1, 4, 0F); // Box 4
		gunModel[4].setRotationPoint(1F, -7F, -2F);

		gunModel[5].addBox(0F, 0F, 0F, 28, 1, 10, 0F); // Box 5
		gunModel[5].setRotationPoint(-27F, -7F, -5F);

		gunModel[6].addBox(0F, 0F, 0F, 13, 8, 6, 0F); // Box 7
		gunModel[6].setRotationPoint(-27F, -7F, -3F);

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 1, 6, 1) }), 6, 6, 1, 14, 6, ModelRendererTurbo.MR_FRONT, new float[] {7 ,1 ,6}); // Shape 9
		gunModel[7].setRotationPoint(-27F, -5F, 3F);
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 6, 4, 1, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 10
		gunModel[8].setRotationPoint(-27F, -5F, -3F);
		gunModel[8].rotateAngleX = 3.14159265F;
		gunModel[8].rotateAngleZ = -1.57079633F;

		gunModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 4, 3, 1, 8, 4, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 12
		gunModel[9].setRotationPoint(1F, -6F, -2F);
		gunModel[9].rotateAngleY = -3.14159265F;
		gunModel[9].rotateAngleZ = 3.14159265F;

		gunModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 70, 4, 3, 12, 70, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Shape 14
		gunModel[10].setRotationPoint(43F, -13F, 2F);
		gunModel[10].rotateAngleY = -1.57079633F;
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 15
		gunModel[11].setRotationPoint(-27F, -13F, 2F);
		gunModel[11].rotateAngleY = -1.57079633F;
		gunModel[11].rotateAngleZ = 1.57079633F;

		gunModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 16
		gunModel[12].setRotationPoint(-28F, -13F, -2F);
		gunModel[12].rotateAngleY = 1.57079633F;
		gunModel[12].rotateAngleZ = 1.57079633F;

		gunModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 12, 4, 3, 12, 12, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Shape 17
		gunModel[13].setRotationPoint(-27F, -13F, -2F);
		gunModel[13].rotateAngleY = 1.57079633F;
		gunModel[13].rotateAngleZ = 1.57079633F;

		gunModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 42, 3, 1, 8, 42, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 18
		gunModel[14].setRotationPoint(43F, -7F, 5F);
		gunModel[14].rotateAngleY = -1.57079633F;
		gunModel[14].rotateAngleZ = 3.14159265F;

		gunModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 1, 3, 1) }), 42, 3, 1, 8, 42, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,3}); // Shape 19
		gunModel[15].setRotationPoint(1F, -7F, -5F);
		gunModel[15].rotateAngleY = 1.57079633F;
		gunModel[15].rotateAngleZ = 3.14159265F;

		gunModel[16].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 1, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Shape 20
		gunModel[16].setRotationPoint(-14F, -6F, 5F);
		gunModel[16].rotateAngleY = -1.57079633F;
		gunModel[16].rotateAngleZ = 3.14159265F;

		gunModel[17].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 2, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Shape 21
		gunModel[17].setRotationPoint(-27F, -6F, -5F);
		gunModel[17].rotateAngleY = 1.57079633F;
		gunModel[17].rotateAngleZ = 3.14159265F;

		gunModel[18].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Trigger
		gunModel[18].setRotationPoint(6F, -3F, -1F);

		gunModel[19].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 23
		gunModel[19].setRotationPoint(9F, -14F, -2F);

		gunModel[20].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Shape 24
		gunModel[20].setRotationPoint(41F, -13F, 2F);

		gunModel[21].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Shape 25
		gunModel[21].setRotationPoint(7F, -13F, -2F);
		gunModel[21].rotateAngleY = 3.14159265F;

		gunModel[22].addBox(0F, 0F, 0F, 45, 2, 2, 0F); // Box 28
		gunModel[22].setRotationPoint(43F, -10F, -1F);

		gunModel[23].addBox(0F, 0F, 0F, 25, 1, 4, 0F); // Box 30
		gunModel[23].setRotationPoint(14F, -6F, -2F);

		gunModel[24].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Shape 31
		gunModel[24].setRotationPoint(41F, -6F, -2F);
		gunModel[24].rotateAngleX = 3.14159265F;

		gunModel[25].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 44, 4, 3, 12, 44, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Shape 27
		gunModel[25].setRotationPoint(-1F, -13F, -2F);
		gunModel[25].rotateAngleY = 1.57079633F;
		gunModel[25].rotateAngleZ = 1.57079633F;

		gunModel[26].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 28
		gunModel[26].setRotationPoint(-15F, -13F, -5F);

		gunModel[27].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 29
		gunModel[27].setRotationPoint(-2F, -13F, -5F);

		gunModel[28].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // Box 30
		gunModel[28].setRotationPoint(-14F, -13F, -5F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 29

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 29
		defaultBarrelModel[0].setRotationPoint(88F, -11F, -2F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6

		ammoModel[0].addBox(0F, 0F, 0F, 12, 13, 4, 0F); // Box 6
		ammoModel[0].setRotationPoint(-14F, -6F, -2F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 35

		slideModel[0].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 35
		slideModel[0].setRotationPoint(-14F, -10F, -3F);



		barrelAttachPoint = new Vector3f(88F /16F, 9F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(23F /16F, 14F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(27 /16F, 4F /16F, 0F /16F);


		gunSlideDistance = 1.25F;


		animationType = EnumAnimationType.BULLPUP;


		minigunBarrelOrigin = new Vector3f(0 /16F, -9F /16F, 0F /16F);


		barrelBreakPoint = new Vector3f(0 /16F, -6F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}