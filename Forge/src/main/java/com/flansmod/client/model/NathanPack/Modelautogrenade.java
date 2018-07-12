//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: autogrenade
// Model Creator: 
// Created on: 30.09.2017 - 13:13:25
// Last changed on: 30.09.2017 - 13:13:25

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelMG;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelautogrenade extends ModelMG //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelautogrenade() //Same as Filename
	{
		bipodModel = new ModelRendererTurbo[4];
		bipodModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox6
		bipodModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox7
		bipodModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox10
		bipodModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox11

		bipodModel[0].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Import ImportBox6
		bipodModel[0].setRotationPoint(-1F, -4F, -2F);

		bipodModel[1].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import ImportBox7
		bipodModel[1].setRotationPoint(0F, -2F, 0F);
		bipodModel[1].rotateAngleY = -3.83972435F;
		bipodModel[1].rotateAngleZ = 1.22173048F;

		bipodModel[2].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import ImportBox10
		bipodModel[2].setRotationPoint(0F, -2F, 0F);
		bipodModel[2].rotateAngleX = 1.22173048F;
		bipodModel[2].rotateAngleY = -0.87266463F;

		bipodModel[3].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Import ImportBox11
		bipodModel[3].setRotationPoint(0.5F, -3F, 0F);
		bipodModel[3].rotateAngleX = -0.45378561F;
		bipodModel[3].rotateAngleY = 3.14159265F;


		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportBox0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import ImportBox1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox2
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox3
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import ImportBox4
		gunModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportBox5
		gunModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import ImportBox12

		gunModel[0].addBox(-2F, -3F, -7F, 4, 4, 13, 0F); // Import ImportBox0
		gunModel[0].setRotationPoint(0F, -4F, -2F);

		gunModel[1].addBox(-1F, -2F, 6F, 2, 2, 13, 0F); // Import ImportBox1
		gunModel[1].setRotationPoint(0F, -4F, -2F);

		gunModel[2].addBox(2F, -3F, -9F, 1, 4, 1, 0F); // Import ImportBox2
		gunModel[2].setRotationPoint(0F, -4F, -2F);

		gunModel[3].addBox(-3F, -3F, -9F, 1, 4, 1, 0F); // Import ImportBox3
		gunModel[3].setRotationPoint(0F, -4F, -2F);

		gunModel[4].addShapeBox(-3F, -2.5F, -8F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Import ImportBox4
		gunModel[4].setRotationPoint(0F, -4F, -2F);

		gunModel[5].addShapeBox(2F, -2.5F, -8F, 1, 3, 2, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Import ImportBox5
		gunModel[5].setRotationPoint(0F, -4F, -2F);

		gunModel[6].addBox(-2.5F, -2.5F, -4F, 5, 3, 10, 0F); // Import ImportBox12
		gunModel[6].setRotationPoint(0F, -4F, -2F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import ImportBox13

		ammoModel[0].addBox(-8.5F, -3F, -3F, 6, 5, 6, 0F); // Import ImportBox13
		ammoModel[0].setRotationPoint(0F, -4F, -2F);



		flipAll();
	}
}