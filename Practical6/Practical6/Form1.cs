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


namespace Practical6
{
    public partial class Form1 : Form
    {
        Microsoft.DirectX.Direct3D.Device device; 
        public Form1()
        {
            InitializeComponent();
            InitDevice(); 
        }
        private void InitDevice()  
        {
            PresentParameters pp = new PresentParameters(); pp.Windowed = true;
            pp.SwapEffect = SwapEffect.Discard;

            device = new Device(0, DeviceType.Hardware, this, CreateFlags.SoftwareVertexProcessing, pp);
            device.RenderState.Lighting = false;
            device.Transform.Projection = Matrix.PerspectiveFovLH(3.14f / 4, device.Viewport.Width / device.Viewport.Height, 1f, 100f);
            device.Transform.View = Matrix.LookAtLH(new Vector3(0, 0, 10), new Vector3(), new Vector3(0, 1, 0));
            device.RenderState.Lighting = true;
            device.Lights[0].Type = LightType.Directional; device.Lights[0].Diffuse = Color.Plum;
            device.Lights[0].Direction = new Vector3(0.8f, 0, -1);
            device.Lights[0].Enabled = true;
        }

        private void Render()  
        {
            CustomVertex.PositionNormalColored[] vertexes = new
            CustomVertex.PositionNormalColored[3]; 

            
            vertexes[0] = new CustomVertex.PositionNormalColored(new Vector3(0, 1, 1), new Vector3(1, 0, 1), Color.Red.ToArgb());
            vertexes[1] = new CustomVertex.PositionNormalColored(new Vector3(-1, -1,
            1), new Vector3(1, 0, 1), Color.Red.ToArgb());
            vertexes[2] = new CustomVertex.PositionNormalColored(new Vector3(1, -1,
            1), new Vector3(-1, 0, 1), Color.Red.ToArgb());

            device.Clear(ClearFlags.Target, Color.Cyan, 1.0f, 0);
            device.BeginScene();
            device.VertexFormat = CustomVertex.PositionNormalColored.Format; device.DrawUserPrimitives(PrimitiveType.TriangleList, vertexes.Length / 3, vertexes);
            device.EndScene();
            device.Present();
        }  


        private void Form1_Paint(object sender, PaintEventArgs e)
        {
            Render(); 
        }
    }
}
