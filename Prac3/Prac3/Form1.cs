using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Microsoft.DirectX;   
using Microsoft.DirectX.Direct3D;   


namespace Prac3
{
public partial class Form1 : Form
    {
Microsoft.DirectX.Direct3D.Device device;  //OUR CODE
public Form1()
        {
InitializeComponent();
InitDevice();                         //OUR CODE
        }

private void InitDevice()       //OUR CODE
        {
PresentParameters pp = new PresentParameters();
pp.Windowed = true;
pp.SwapEffect = SwapEffect.Discard;
            device = new Microsoft.DirectX.Direct3D.Device(0, DeviceType.Hardware, this, CreateFlags.SoftwareVertexProcessing, pp);
        }

    private void Render()       //OUR CODE
        {
CustomVertex.TransformedColored[] v = new CustomVertex.TransformedColored[6]; //6 here is the number of vectors you've defined

//using two triangles to create a rectangle

//triangle1
v[0].Position = new Vector4(100, 100, 0, 1);
v[0].Color = System.Drawing.Color.FromArgb(255, 0, 0).ToArgb();

v[1].Position = new Vector4(400, 100, 0, 1);
v[1].Color = System.Drawing.Color.FromArgb(0, 255, 1).ToArgb();

v[2].Position = new Vector4(400, 300, 0, 1);
v[2].Color = System.Drawing.Color.FromArgb(1, 0, 255).ToArgb();

//triangle2
v[3].Position = new Vector4(400, 300, 0, 1);
v[3].Color = System.Drawing.Color.FromArgb(255, 0, 0).ToArgb();

v[4].Position = new Vector4(100, 300, 0, 1);
v[4].Color = System.Drawing.Color.FromArgb(20, 255, 0).ToArgb();

v[5].Position = new Vector4(100, 100, 0, 1);
v[5].Color = System.Drawing.Color.FromArgb(255, 0, 255).ToArgb();


device.Clear(ClearFlags.Target, Color.Cyan, 0, 1);
device.BeginScene();
device.VertexFormat = CustomVertex.TransformedColored.Format;
device.DrawUserPrimitives(PrimitiveType.TriangleList, 2, v);  //1 for single triangle & 2 for double triangle
device.EndScene();
device.Present();
        }

private void Form1_Paint(object sender, PaintEventArgs e)
        {
Render();   //OUR CODE
        }  

private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}


